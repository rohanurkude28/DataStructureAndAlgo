package sorting;

import static common.Utility.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        //doBubbleSort(arr);
        doBubbleSortOptimized(arr);
        printArray(arr);
    }
    private static void doBubbleSortOptimized(int[] arr){
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) swap(arr, i, i + 1);
            }
        }
    }


    private static void doBubbleSort(int[] arr){
        boolean isSwapped;
        do{
            isSwapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSwapped = true;
                    swap(arr, i, i + 1);
                }
            }
        }while(isSwapped);
    }
}
