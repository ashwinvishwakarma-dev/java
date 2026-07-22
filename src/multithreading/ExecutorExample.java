package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> System.out.println(Thread.currentThread().getName()));

        Future<Integer> f = executor.submit(() -> {
            System.out.println("Submit");
            return 10 + 20;
        });

        try {
            Integer add = f.get();
            System.out.println(add);
            f.get();
        } catch (Exception e) {
            System.out.println("Ashwin-> " + e);
        }

        executor.shutdown();

    }
}
