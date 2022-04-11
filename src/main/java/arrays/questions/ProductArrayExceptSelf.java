package arrays.questions;

import java.util.Arrays;

public class ProductArrayExceptSelf {

    //Time Exceeded
    public static int[] productExceptSelfBruteForce(int[] nums) {
        int[] newNums = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=0;
            int product = 1;
            while(j < nums.length){
                if(j!=i) product = product * nums[j];
                j++;
            }
            newNums[i]=product;
        }
        return newNums;
    }

    public static int[] productExceptSelf3Arrays(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        System.out.println(Arrays.toString(nums));

        leftProduct[0]=1;
        for(int i=0;i<nums.length-1;i++){
            leftProduct[i+1] = leftProduct[i]*nums[i];
        }
        System.out.println(Arrays.toString(leftProduct));

        rightProduct[nums.length-1]=1;
        for(int i=nums.length-1;i>0;i--){
            rightProduct[i-1] = rightProduct[i]*nums[i];
        }
        System.out.println(Arrays.toString(rightProduct));

        for(int i=0;i<nums.length;i++){
            nums[i] = leftProduct[i]*rightProduct[i];
        }


        return nums;
    }

    //O(1) Space Complexity
    public static int[] productExceptSelf(int[] nums) {
        int[] outputArr = new int[nums.length];

        outputArr[0]=1;
        for(int i=0;i<nums.length-1;i++){
            outputArr[i+1] = outputArr[i]*nums[i];
        }

        int R = 1;
        for(int i=nums.length-1;i>=0;i--){
            outputArr[i] = outputArr[i]*R;
            R =R*nums[i];
        }

        return outputArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
}
