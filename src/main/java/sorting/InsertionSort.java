package sorting;

import static common.Utility.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doInsertionSortTraditional(arr);
        //doInsertionSort(arr,1);
        doInsertionSortWhile(arr);
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

    private static void doInsertionSortWhile(int[] arr){
        for(int i =1 ; i<arr.length-1;i++){
            int currentVal  = arr[i];

            int j = i-1;
            while (j>=0 && arr[j]>currentVal){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentVal;

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
