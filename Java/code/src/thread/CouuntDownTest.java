package thread;

import java.util.concurrent.CountDownLatch;

public class CouuntDownTest {

    public static void test() throws InterruptedException {
        CountDownLatch c = new CountDownLatch(2);
        Thread thread1 = new Thread(() -> {

            c.countDown();
            System.out.println("thread1 count down");

        });

        Thread thread2 = new Thread(() -> {
            c.countDown();
            System.out.println("thread2 count down");
        });


        new Thread(() -> {

            try {
                System.out.println("start wait");
                c.await();
                System.out.println("end wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }


    public static void main(String[] args) throws InterruptedException {
        test();
//        CountDownLatch countDownLatch = new CountDownLatch(2);
//        new Thread(() -> {
//            System.out.println(1);
//            countDownLatch.countDown();
//            System.out.println(2);
//            countDownLatch.countDown();
//        }).start();
//        countDownLatch.await();
//        System.out.println("3");
    }
}
