package linear;

import java.util.Arrays;

public class ArrayListOpTest {

    public void merge() {
        ArrayListOp arrayListOp = new ArrayListOp();
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        arrayListOp.merge1(a, 3, b, 3);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArrayListOpTest arrayListOpTest = new ArrayListOpTest();
        arrayListOpTest.merge();
    }
}