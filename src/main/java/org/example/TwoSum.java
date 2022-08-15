package org.example;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j] == needed) {
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {-1};
    }
}