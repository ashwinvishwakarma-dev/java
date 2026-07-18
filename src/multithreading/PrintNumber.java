package multithreading;

public class PrintNumber {
    public static void main(String[] args) {

        Thread thread= new Thread(()->{
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
            }
        });

        Thread thread1= new Thread(()->{
            for (char i = 'A'; i <='E' ; i++) {
                System.out.println(i);
            }
        });

        thread.start();
        thread1.start();

    }
}
