package arrays.questions;

import common.Utility;

import java.util.Arrays;

import static common.Utility.uniqueIntArr;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueIntArr));
        reverseArray(uniqueIntArr, 0, uniqueIntArr.length-1);
        System.out.println(Arrays.toString(uniqueIntArr));
        reverseArrayRecursive(uniqueIntArr, 0, uniqueIntArr.length-1);
        System.out.println(Arrays.toString(uniqueIntArr));
    }

    /*O(n)*/
    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            Utility.swap(arr, start++, end--);
        }
    }

    /*O(n)*/
    static void reverseArrayRecursive(int[] arr, int start, int end) {
        if (start >= end) return;
        System.out.println("Start: "+start+" End: "+end+" array: "+Arrays.toString(arr));
        Utility.swap(arr, start, end);
        reverseArrayRecursive(arr,++start,--end);
    }
}
