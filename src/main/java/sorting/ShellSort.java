package sorting;

import static common.Utility.*;

public class ShellSort extends InsertionSort {
    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doShellSortUsingInsertion(arr);
        printArray(arr);
    }

    private static void doShellSortUsingInsertion(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            doInsertionSort(arr,gap);
        }
    }

}
