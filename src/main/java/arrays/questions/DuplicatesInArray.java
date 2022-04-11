package arrays.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {
    public static boolean containsDuplicateSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++) set.add(nums[i]);

        return nums.length==set.size();
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++) if(nums[i]==nums[i+1]) return true;

        return false;
    }

    public static void main(String[] args) {

    }
}
