package design_pattern.structural;

public class Facade {
    public static void main(String[] args) {

        AmazonFacade amazonFacade = new AmazonFacade(new OrderService(), new ShipmentService(),
                                                        new AnalyticsService(), new EmailService());

        amazonFacade.amazonOrder();
    }
}

class AmazonFacade {

    OrderService orderService;
    ShipmentService shipmentService;
    AnalyticsService analyticsService;
    EmailService emailService;

    AmazonFacade(OrderService orderService, ShipmentService shipmentService,
                 AnalyticsService analyticsService, EmailService emailService) {
        this.orderService = orderService;
        this.shipmentService = shipmentService;
        this.analyticsService = analyticsService;
        this.emailService = emailService;
    }

    public void amazonOrder() {
        orderService.orderCreate();
        emailService.sentEmail();
        shipmentService.track();
        analyticsService.dashboard();
    }
}

class OrderService {
    public void orderCreate() {
        System.out.println("Order Created");
    }
}

class EmailService {
    public void sentEmail() {
        System.out.println("Email");
    }
}

class ShipmentService {
    public void track() {
        System.out.println("Shipment");
    }
}

class AnalyticsService {
    public void dashboard() {
        System.out.println("Dashboard");
    }
}
