package sorting;

import static common.Utility.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doBubbleSort(arr);
        printArray(arr);
    }
    private static void doBubbleSort(int[] arr){
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
            }
        }
    }
}
