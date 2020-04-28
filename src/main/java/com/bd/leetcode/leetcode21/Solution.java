package com.bd.leetcode.leetcode21;


/**
 * @author xupeng
 * @date: 23/03/2020
 */
public class Solution {
  private int N;

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }


  }

  ListNode first;

  public int size() {
    return N;
  }

  public void insertFromHead(int val) {
    if (first == null) {
      first = new ListNode(val);
      N++;
    } else {
      ListNode oldFirst = first;
      first = new ListNode(val);
      first.next = oldFirst;
      N++;
    }
  }



  public static void main(String[] args) {
    Solution nodes = new Solution();
  }
}
