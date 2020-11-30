package thread;

import java.util.concurrent.*;

public class SemaphoreTest {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 5; i++) {
            final int tmp = i + 1;
            threadPool.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(tmp);
                    int queueLength = semaphore.getQueueLength();
                    System.out.println("await " + queueLength);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
    }
}
