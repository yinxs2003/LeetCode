package com.bd.leetcode.cuoti.leetcode_16;

import com.bd.sort.QuickSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int threeSumClosest(int[] nums) {
        QuickSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        Map<Integer,Integer> aMap = new HashMap<Integer, Integer>();
        int left = 0;
        int mid = left + 1;
//        for(;mid )

        return 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.threeSumClosest(new int[]{-1, 2, 1, -4});
    }
}