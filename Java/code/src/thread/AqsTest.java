package thread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * AqsTest class
 *
 * @author yujinchun
 * @date 2020/12/19
 */
public class AqsTest {

    public static void main(String[] args) {
//        conditionTest();
        cyclicBarrierTest();
    }

    private static void conditionTest() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        IntStream.range(1, 2).forEach(x -> new Thread(() -> {
            lock.lock();
            try {
                condition.await();
                System.out.println(Thread.currentThread().getId());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }));

        Thread.sleep(1000L);
        lock.lock();
        try {
            System.out.println("release lock starting");
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    private static void cyclicBarrierTest() {
        int threadNum = 5;
        CyclicBarrier barrier = new CyclicBarrier(threadNum, () -> System.out.println(Thread.currentThread().getName() + " 完成最后任务"));

        for (int i = 0; i < threadNum; i++) {
            new TaskThread(barrier).start();
        }
    }

    static class TaskThread extends Thread {

        CyclicBarrier barrier;

        public TaskThread(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(getName() + " 到达栅栏 A");
                barrier.await();
                System.out.println(getName() + " 冲破栅栏 A");

                Thread.sleep(2000);
                System.out.println(getName() + " 到达栅栏 B");
                barrier.await();
                System.out.println(getName() + " 冲破栅栏 B");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

