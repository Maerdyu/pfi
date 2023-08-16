package linear.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToSum {
    // 两数和
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) != null){
                return new int[]{map.get(nums[i]), i};
            }
            map.putIfAbsent(target- nums[i], i);
        }
        return null;
    }

    // 字母异位
    public List<List<String>> groupAnagrams(String[] strs) {
        // 通过排序或者记录每个字符出现的次数判断两个字符是否一致。
        return null;
    }

    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        ToSum toSum = new ToSum();
        int[] ints = toSum.twoSum(a, 9);
        System.out.println(ints[0] + "," + ints[1]);
    }
}
