package sorting;

import static common.Utility.*;

// O(n^2) - remember lastUnsortedIndex will make it more efficient but worst case is O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doSelectionSort(arr);
        printArray(arr);
    }
    private static void doSelectionSort(int[] arr){
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
            }
        }
    }
}
