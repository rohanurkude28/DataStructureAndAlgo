package sorting;

import static common.Utility.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        //doInsertionSortTraditional(arr);
        doInsertionSort(arr,1);
        printArray(arr);
    }

    private static void doInsertionSortTraditional(int[] arr){
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
        }
    }

    protected static void doInsertionSort(int[] arr,int gap) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
    }
}
