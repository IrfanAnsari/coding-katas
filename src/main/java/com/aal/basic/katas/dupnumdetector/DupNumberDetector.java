package com.aal.basic.katas.dupnumdetector;

import java.util.HashMap;
import java.util.Map;

/**
 * User: irfanansari
 * Date: 31/01/2013
 * Time: 14:23
 */
public class DupNumberDetector {
    public int extractDuplicate(int[] numArray, int nums) {

        int sum = nums * (nums + 1) / 2;

        for (int i = 0; i < numArray.length; i++) {
             sum = sum - numArray[i];

        }

        return -sum;
    }


    public  int findDup(int[] numArray) {
        Map<Integer, Integer> nums = new HashMap<Integer, Integer>();

        for (int i = 0; i < numArray.length; i++) {

            if(nums.get(numArray[i]) != null){
                return numArray[i];
            }
            nums.put(numArray[i], numArray[i]);

        }

        throw new IllegalArgumentException("No Duplicate in the array");
    }
}



