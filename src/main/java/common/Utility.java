package common;

import java.util.Arrays;

public class Utility {

    public static int[] uniqueIntArr = {22, 44, 11, 23, 99, -2, 90};
    public static int[] positiveIntArr = {2,5,9,8,2,8,7,10,4,3};

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
