package arrays.questions;

import common.Utility;
import java.util.Arrays;
import static common.Utility.mixedIntArr;

public class NegativeValArray {
    public static void main(String[] args) {
        rearrange(mixedIntArr);
        System.out.println(Arrays.toString(mixedIntArr));
    }

    static void rearrange(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if (i != j)
                Utility.swap(arr,i,j);

                j++;
            }
        }
    }

}
