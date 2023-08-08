package linear.array;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */

// LeetCode 189
public class RotateArray {

    // 反转法
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, length-1);

    }

    // end 不为长度，为数组序号
    private void reverse(int[] nums, int start, int end) {
        int i = (start + end + 1) / 2;
        for (int j = start; j < i; j++) {
            int temp = nums[j];
            nums[j] = nums[end - j + start];
            nums[end - j + start] = temp;
        }
    }

    // 环状替换

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] a = {1,2,3,4,5,6,7};
        rotateArray.rotate(a ,3);
        Arrays.stream(a).forEach(System.out::println);
    }
}
