package linear;

/**
 * 数组操作
 */
public class ArrayListOp {

    private Object[] elements;


    // 有序数组添加

    // 有序数组删除

    // 数组倒序

    // 有序数组合并

    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * <p>
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * <p>
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] c1 = new int[m];
        System.arraycopy(nums1, 0, c1, 0, m);
        int j = 0, i = 0;
        while (i < m || j < n) {
            if (i == m) {
                nums1[i + j] = nums2[j++];
                continue;
            } else if (j == n) {
                nums1[i + j] = c1[i++];
                continue;
            }

            if (c1[i] > nums2[j]) {
                nums1[i + j] = nums2[j++];
            } else {
                nums1[i + j] = c1[i++];
            }
        }
    }
}
