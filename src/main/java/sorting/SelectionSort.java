package sorting;

import static common.Utility.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doSelectionSort(arr);
        printArray(arr);
    }

    private static void doSelectionSort(int[] arr){
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestLoc = 0;

            for (int i = 1; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestLoc]) {
                    largestLoc = i;
                }
            }
            swap(arr, largestLoc, lastUnsortedIndex);
        }
    }
}
