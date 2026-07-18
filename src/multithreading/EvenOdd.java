package multithreading;

public class EvenOdd {

    public static void main(String[] args) {

        NumberPrinter thread = new NumberPrinter();

        Thread evenThread = new Thread(() -> {
            try {
                thread.even();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread oddThread = new Thread(() -> {
            try {
                thread.odd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        evenThread.start();
        oddThread.start();
    }

}

class NumberPrinter extends Thread {
    int number = 0;
    boolean isEven = true;

    public synchronized void even() throws InterruptedException {
        for (int i = 0; i <= 10; i++) {
            while (!isEven) {
                wait();
            }
            System.out.println("Even Number:- " + number);
            number++;
            isEven = false;
            notify();
        }
    }

    public synchronized void odd() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            while (isEven) {
                wait();
            }
            System.out.println("Odd  Number:- " + number);
            number++;
            isEven = true;
            notify();
        }
    }

}