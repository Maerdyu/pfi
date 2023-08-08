package linear.array;

import java.util.Arrays;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */

// LeetCode 88
public class ArrayRemoveDuplicate2 {

    // 双指针
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return length;
        }

        int j = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        ArrayRemoveDuplicate2 arrayRemoveDuplicate2 = new ArrayRemoveDuplicate2();
        int[] a = {1,1,1,2,2,3};
        int i = arrayRemoveDuplicate2.removeDuplicates(a);
        Arrays.stream(a).forEach(System.out::println);
        System.out.println("ret:" + i);
    }
}
