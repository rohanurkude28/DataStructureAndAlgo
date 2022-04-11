package arrays.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int currentSum = 0;
        ArrayList<Integer> subArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            while (currentSum > s && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum < s) {
                currentSum += arr[i];
                if (currentSum == s) {
                    subArray.add(++start);
                    subArray.add(i);
                    break;
                }
            }


        }
        if (subArray.isEmpty()) subArray.add(-1);

        return subArray;
    }

    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 15;

        int arr[] = { 1,2,3,7,5 };
        int sum = 12;

        int n = arr.length;
        System.out.println(subarraySum(arr, n, sum));
    }
}
