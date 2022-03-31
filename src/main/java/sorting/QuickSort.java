package sorting;

import static common.Utility.printArray;
import static common.Utility.uniqueIntArr;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doQuickSort(arr, 0, arr.length);
        printArray(arr);
    }

    private static void doQuickSort(int[] arr, int start, int end) {
        if (end - start < 2) return;

        int pivotIndex = doPartition(arr, start, end);
        doQuickSort(arr, start, pivotIndex);
        doQuickSort(arr, pivotIndex + 1, end);
    }

    private static int doPartition(int[] arr, int start, int end) {
        // This is using the first element as the pivot
        int pivot = arr[start];
        int i = start;
        int j = end;

        while (i < j) {
            //NOTE: Empty Loop body, just traversing j left to right
            while (i < j && arr[--j] >= pivot);

            if (i < j) {
                arr[i] = arr[j];
            }

            //NOTE: Empty Loop body, just traversing i right to left
            while (i < j && arr[++i] <= pivot);

            if (i < j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }
}
