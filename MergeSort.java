public class MergeSort {
    public static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);       // Sort left half
        sort(arr, mid + 1, high);  // Sort right half
        merge(arr, low, mid, high); // Merge sorted halves
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        // Copy data to temp arrays
        System.arraycopy(arr, low, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);
        
        // Merge the temp arrays back into arr[low..high]
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        
        // Copy remaining elements
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 10};
        sort(arr, 0, arr.length - 1);
        System.out.println(java.util.Arrays.toString(arr)); // [10, 27, 38, 43]
    }
}   