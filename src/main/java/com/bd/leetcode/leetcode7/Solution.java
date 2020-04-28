package com.bd.leetcode.leetcode7;

/**
 * @author xupeng
 * @date: 23/04/2020
 */
public class Solution {
  public int reverse(int x) {
    String xString = Integer.toString(x);
    String string = xString;
    int flag = 1;
    if (x < 0) {
      flag = -1;
      string = xString.substring(1);
    }
    try {
      return Integer.valueOf((new StringBuilder(string)).reverse().toString()) * flag;
    }catch (Exception e){
      return 0;
    }
  }


  public static void main(String[] args) {
    Solution s = new Solution();
    int a = s.reverse(1534236469);
    System.out.println(a);
  }
}
