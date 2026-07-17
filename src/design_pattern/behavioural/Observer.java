package design_pattern.behavioural;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static void main(String[] args) {

        NotifyObserver notifyObserver = new NotifyObserver();

        OrderObserver inventoryService = new InventoryService();
        OrderObserver analyticsService = new AnalyticsService();
        OrderObserver emailService = new EmailService();

        notifyObserver.subscribe(inventoryService, "Inventory");
        notifyObserver.subscribe(analyticsService, "Analytics");
        notifyObserver.subscribe(emailService, "Email");

        notifyObserver.placeOrder("123");

        notifyObserver.unSubscribe(emailService, "Email");

        notifyObserver.placeOrder("456");

    }
}

interface OrderObserver {
    void update(String orderId);
}

class EmailService implements OrderObserver {

    @Override
    public void update(String orderId) {
        System.out.println("Email Sent for OrderId:- " + orderId);
    }
}

class InventoryService implements OrderObserver {

    @Override
    public void update(String orderId) {
        System.out.println("Inventory update for OrderId:- " + orderId);
    }
}

class AnalyticsService implements OrderObserver {

    @Override
    public void update(String orderId) {
        System.out.println("Dashboard updated for OrderId:- " + orderId);
    }
}

class NotifyObserver {
    List<OrderObserver> observersList = new ArrayList<>();

    public void subscribe(OrderObserver observer, String subscriber) {
        observersList.add(observer);
        System.out.println(subscriber + " Subscribed");
    }

    public void unSubscribe(OrderObserver observer, String subscriber) {
        observersList.remove(observer);
        System.out.println(subscriber + " Unsubscribed");
    }

    public void placeOrder(String orderId) {
        notifySubscriber(orderId);
        System.out.println("Order place :- " + orderId);
    }

    private void notifySubscriber(String orderId) {
        for (OrderObserver orderObserver : observersList) {
            orderObserver.update(orderId);
        }
    }
}
