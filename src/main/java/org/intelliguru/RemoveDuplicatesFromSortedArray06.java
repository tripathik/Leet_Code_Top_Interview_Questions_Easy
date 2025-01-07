package org.intelliguru;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray06 {
    public int removeDuplicates(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        int unique = 0;
        for(int num : nums){
            if(!numSet.contains(num)){
                numSet.add(num);
                unique++;
            }
        }
        return unique;
    }

    public int removeDuplicateUsingTwoPointer(int[] nums){
        int i =0;
        for(int j =1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
