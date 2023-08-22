package linear;

public class QuickSot {

    public int[] sort(int[] a, int start, int end) {
        if (start >= end) {
            return a;
        }
        int s = partition(a, start, end);
        sort(a, start, s - 1);
        sort(a, s + 1, end);
        return a;
    }

    private int partition(int[] a, int start, int end) {
        int i =start, compare = a[end];
        for (int j = start; j < end; j++) {
            if(a[j] < compare){
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, end);
        return i;
    }

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        int[] a = {5,4,2,1,3};
        QuickSot quickSot = new QuickSot();
        quickSot.sort(a, 0, a.length-1);
        for (int j : a) {
            System.out.println(j);
        }
    }
}
