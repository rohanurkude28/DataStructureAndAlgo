package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static common.Utility.*;

public class BucketSort {

    public static void main(String[] args) {
        int[] arr = uniqueIntArr;
        doBucketSort(arr);
        printArray(arr);
    }
    private static void doBucketSort(int[] arr){
        List<Integer>[] buckets = new List[10];

        for(int i =0; i < buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i =0; i < arr.length;i++){
            buckets[hash(arr[i])].add(arr[i]);
        }

        Arrays.stream(buckets).forEach(bucket -> Collections.sort(bucket)); // Adaptive merge sort

        AtomicInteger j= new AtomicInteger();
        for(int i =0;i<buckets.length;i++){
            buckets[i].forEach(x ->{
                    arr[j.getAndIncrement()] = x;
            });
        }
    }

    private static int hash(int value){
        return value / 10;
    }
}
