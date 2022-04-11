package arrays.questions;

import static common.Utility.uniqueIntArr;

public class MinMaxOfArray {

    static class Pair {
        long min;
        long max;

        public Pair(){}

        public Pair(long min, long max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return "Array{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
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



    static Pair getMinMax(long a[], long n)
    {
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        Pair minMax = null;
        if (a.length == 1) {
            min=a[0];
            max=a[0];
        }

        if (a[0] > a[1]) {
            min=a[1];
            max=a[0];
        } else {
            min=a[0];
            max=a[1];
        }


        for (int i = 2; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }

        minMax = new Pair(min,max);
        return minMax;
    }


    public static void main(String[] args) {
        System.out.println(getMinMaxPair(uniqueIntArr));
        System.out.println(getMinMaxPairRecursive(uniqueIntArr,0,uniqueIntArr.length-1));

        long[] arr ={3,2,1,56,1000,167};
        System.out.println(getMinMax(arr,6));

    }

}
