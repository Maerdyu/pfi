package linear.array;

/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */

// LeetCode 169
public class ArrayMostElements {

    // 摩尔投票法
    public int majorityElement(int[] nums) {
        int cnt = 0, num = 0;
        for (int i = 0; i < nums.length; i++) {
            if(cnt == 0){
                num = nums[i];
            }

            cnt += num == nums[i] ? 1:-1;
        }
        return num;
    }

    // 哈希

    // 分治

    // 排序取中间值

    public static void main(String[] args) {
        ArrayMostElements arrayMostElements = new ArrayMostElements();
        int[] a = {2,2,1,1,1,2,2};
        int i = arrayMostElements.majorityElement(a);
        System.out.println("most elements is:" + i);
    }
}
