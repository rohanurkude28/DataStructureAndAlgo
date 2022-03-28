package common;

import java.util.Arrays;

public class Utility {

    public static int[] uniqueIntArr = {22, 44, 11, 23, 99, -2, 90};
    public static int[] mixedIntArr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    public static int[] positiveIntArr = {2,5,9,8,2,8,7,10,4,3};
    public static int[] sameWidthIntArr = {4725,4586,1330,8792,1594,5729};
    public static int[] arrOf012 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
