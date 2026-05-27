public class QuickSort{
    public static void quickSort(int[] arr, int start, int end){
        if(end<=start){
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int idx = start-1;

        for (int j = start;j<end;j++){
            if(arr[j]<pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }

        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;
    }
    public static void printArray(int[] arr){
        System.out.print("{");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 7, 9, 2, 8, 5, 4};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}