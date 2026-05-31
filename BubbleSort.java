public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swaps occurred, array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(data);
        System.out.println("Sorted Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}   