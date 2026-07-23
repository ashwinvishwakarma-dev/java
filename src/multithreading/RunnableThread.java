package multithreading;

public class RunnableThread {
    public static void main(String[] args) {

        Thread thread=new Thread(new ThreadA());

        Thread thread1 = new Thread(()-> {
            System.out.println(Thread.currentThread().getName()+" Anonymous");
        });

        thread.start();
        thread1.start();

        System.out.println(Thread.currentThread().getName()+" Main");
    }

}

class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Child");
    }
}

