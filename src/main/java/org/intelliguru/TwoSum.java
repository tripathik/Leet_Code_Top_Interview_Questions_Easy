package org.intelliguru;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int complement  = target-nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement),i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
