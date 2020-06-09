package com.bd.leetcode.leetcode_160;

import java.util.Arrays;

class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] a = new int[]{-1,-1};
            for(int i = 0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i] + nums[j] == target) {
                        a[0] = i;
                        a[1] = j;
                    }
                }
            }

            return a;
        }

    public int binarySearch(int[] nums, int key){
        int lo = 0;
        int hi = nums.length - 1 ;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(key<nums[mid]) hi = mid - 1;
            if(key>nums[mid]) lo = mid + 1;
            if(key == nums[mid]) return mid;
        }
        return -1;
    }

    public int[] sortedNums(int[] nums){
        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        return  nums;
    }

    public static void main(String[] args){
        int[] arr ={3,2,4};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(arr,6)));
    }
}