package multithreading;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.start();

        System.out.println(Thread.currentThread().getName());

    }
}

class MyThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}