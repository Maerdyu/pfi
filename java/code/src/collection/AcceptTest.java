package collection;

import java.util.ArrayList;
import java.util.function.Consumer;

public class AcceptTest {
    public static void main(String[] args) {
        foreachTest();
    }

    public static void foreachTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.forEach(System.out::println);
    }

    /**
     * 测试创建Consumer
     * 在forEach方法的入参就是一个Consumer
     */
    public static void createConsumerTest() {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(10);
    }
}
