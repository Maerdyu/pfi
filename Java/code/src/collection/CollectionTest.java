package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTest {
    private static final ArrayList<Integer> list;

    static {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
    }

    public static void main(String[] args) {
//        toArrayTest();
        removeIfTest();  //result:true list:[1]
    }

    private static void toArrayTest() {
        // [1, 2, null]
        Integer[] a = {2, 3, 4};
        // Integer[] a = {};   //[1, 2]
        Integer[] toArray = list.toArray(a);
        System.out.println(Arrays.toString(toArray));
    }

    private static void removeIfTest() {
        boolean b = list.removeIf(x -> x > 1);
        System.out.println("result:" + b + " list:" + list);
    }
}
