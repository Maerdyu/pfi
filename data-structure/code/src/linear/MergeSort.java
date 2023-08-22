package linear;

public class MergeSort {
    public void sort(int[] a){
        mSort(a, 0, a.length-1);
    }

    public void mSort(int[] a, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mSort(a, start, mid);
        mSort(a, mid+1, end);
        merge(a, start, mid, end);
    }

    private void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[a.length];
        int i = start, j = mid +1, k=0;
        while (i<mid && j < end){
            if(a[i] < a[j]){
                tmp[k++] = a[i++];
            }else {
                tmp[k++] = a[j++];
            }
        }
        for (int l = start, m=0; l < end; l++, m++) {
            a[l] = tmp[m];
        }
    }


    public static void main(String[] args) {
       
    }
}
