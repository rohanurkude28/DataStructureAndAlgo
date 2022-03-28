package arrays.questions;

import common.Utility;
import java.util.Arrays;
import static common.Utility.arrOf012;


public class Sort012Array {

    static void sort012(int arr[], int arr_size)
    {
        int low = 0;
        int high = arr_size - 1;
        int mid = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    Utility.swap(arr,low++,mid++);
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    Utility.swap(arr,mid,high--);
                    break;
                }
            }
        }
    }

    static void countNSortArr(int arr[], int n)
    {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // Count the number of 0s, 1s and 2s in the array
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        // Update the counter of array
        i = 0;

        // Store all the 0s in the beginning
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        // Then all the 1s
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        // Finally, all the 2s
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
    }

    public static void main(String[] args) {
        //sort012(arrOf012,arrOf012.length);
        countNSortArr(arrOf012,arrOf012.length);
        System.out.println(Arrays.toString(arrOf012));
    }
}
