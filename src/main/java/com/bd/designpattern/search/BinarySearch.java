package com.bd.designpattern.search;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class BinarySearch {
  public static int rank(int key, int[] arr) {
    int lo = 0;
    int hi = arr.length - 1;

    while (lo < hi) {
      int mid = (hi + lo) / 2;
      if (key < arr[mid]) hi = mid;
      if (key > arr[mid]) lo = mid;
      if (key == arr[mid]) return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {12, 33, 44, 55};

    int index = BinarySearch.rank(44, arr);
    System.out.println(String.format("index: %s", index));
  }
}
