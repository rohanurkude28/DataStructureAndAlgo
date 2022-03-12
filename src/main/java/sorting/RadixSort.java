package sorting;

import static common.Utility.sameWidthIntArr;
import static common.Utility.printArray;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = sameWidthIntArr;
        doRadixSort(arr, 10, 4);
        printArray(arr);
    }

    private static void doRadixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) {
            doRadixSingleSort(arr, radix, i);
        }

    }

    private static void doRadixSingleSort(int[] arr, int radix, int position) {
        int numItems = arr.length;
        int[] countArray = new int[radix];

        for (int val : arr) {
            countArray[getDigit(position, radix, val)]++;
        }

        //Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIdx = numItems - 1; tempIdx >= 0; tempIdx--) {
            temp[--countArray[getDigit(position,radix, arr[tempIdx])]] = arr[tempIdx];
        }

        for (int tempIdx = 0; tempIdx < numItems; tempIdx++) {
            arr[tempIdx] = temp[tempIdx];
        }
    }

    private static int getDigit(int position, int radix, int val) {
        return val / (int) Math.pow(radix, position) % radix;

    }
}
