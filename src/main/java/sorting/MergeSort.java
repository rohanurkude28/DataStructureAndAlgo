package sorting;

import static common.Utility.*;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = uniqueIntArr;

        doMergeSort(arr,0,arr.length);
        printArray(arr);
    }

    private static void doMergeSort(int[] arr, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;

        doMergeSort(arr, start, mid);
        doMergeSort(arr, mid, end);

        doMerge(arr, start, mid, end);
    }

    private static void doMerge(int[] arr, int start, int mid, int end) {
        if (arr[mid - 1] <= arr[mid]) return; // Last element in left array and first element in right array is in order indicating sorted array

        int i = start;
        int j = mid;
        int tempIdx = 0;

        int[] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempIdx++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr,i,arr,start+tempIdx,mid-i);
        System.arraycopy(temp,0,arr,start,tempIdx);

    }
}
