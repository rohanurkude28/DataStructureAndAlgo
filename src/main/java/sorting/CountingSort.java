package sorting;

import static common.Utility.printArray;
import static common.Utility.positiveIntArr;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = positiveIntArr;
        doCountingSort(arr,1,10);
        printArray(arr);
    }

    private static void doCountingSort(int[] arr, int min, int max) {

        int[] countArr = new int[(max - min) + 1];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArr[i - min] > 0){
                arr[j++]=i;
                countArr[i - min]--;
            }
        }
    }
}
