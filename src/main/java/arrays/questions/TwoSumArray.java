package arrays.questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumArray {
    public static int[] twoSumSorted(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;

        while(i<=j){
            int sum = nums[i]+nums[j];
            if(sum<target) i++;
            else if(sum>target) j--;
            else return new int[]{i, j};
        }

        return new int[]{i, j};
    }

    public int[] twoSumBruteForce(int[] nums, int target) {
        int i = 0;
        int j = 0;

        A1: for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target) break A1;
            }
        }

        return new int[]{i, j};
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No value found");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}