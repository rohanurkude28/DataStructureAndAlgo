package arrays.questions;

import static common.Utility.uniqueIntArr;

public class MinMaxOfArray {

    static class Pair {
        int min;
        int max;

        @Override
        public String toString() {
            return "Array{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(getMinMaxPair(uniqueIntArr));
        System.out.println(getMinMaxPairRecursive(uniqueIntArr,0,uniqueIntArr.length-1));
    }

    public static Pair getMinMaxPair(int[] arr) {
        Pair minMax = new Pair();
        if (arr.length == 1) {
            minMax.min = arr[0];
            minMax.max = arr[0];
        }

        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.min = arr[0];
            minMax.max = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }

        return minMax;
    }

    public static Pair getMinMaxPairRecursive(int[] arr, int low, int high) {
        Pair minMax = new Pair();
        Pair minMaxPart1 = new Pair();
        Pair minMaxPart2 = new Pair();

        if (low == high) {
            minMax.min = arr[low];
            minMax.max = arr[low];
            return minMax;
        } else if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minMax.min = arr[high];
                minMax.max = arr[low];
            } else {
                minMax.min = arr[low];
                minMax.max = arr[high];
            }
            return minMax;
        }

        int mid = (high + low )/ 2;
        minMaxPart1 = getMinMaxPairRecursive(arr,low,mid);
        minMaxPart2 = getMinMaxPairRecursive(arr,mid+1,high);


        if (minMaxPart1.min < minMaxPart2.min) {
            minMax.min = minMaxPart1.min;
        } else {
            minMax.min = minMaxPart2.min;
        }

        if (minMaxPart1.max > minMaxPart2.max) {
            minMax.max = minMaxPart1.max;
        } else {
            minMax.max = minMaxPart2.max;
        }

        return minMax;
    }

}
