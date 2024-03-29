package linear.array;

import java.util.Arrays;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */

// LeetCode 27
public class ArrayRemoveElement {

    // 其实也是一种双指针的方法，一个在头，一个在尾，每次存在相等值的时候挪到最后
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; ) {
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        ArrayRemoveElement arrayRemoveElement = new ArrayRemoveElement();
        int[] a = {1, 1, 2, 1, 4, 3, 5, 2};
        int length = arrayRemoveElement.removeElement(a, 2);
        Arrays.stream(a).forEach(System.out::println);
        System.out.println("length:" + length);
    }
}
