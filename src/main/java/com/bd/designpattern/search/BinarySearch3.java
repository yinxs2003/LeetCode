package com.bd.designpattern.search;

/**
 * @author xupeng
 * @date: 01/04/2020
 */
public class BinarySearch3 {
  public static int search(int key, int[] arr) {
    int lo = 0;
    int hi = arr.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (arr[key] < arr[mid]) hi = mid - 1;
      if (arr[key] > arr[mid]) lo = mid + 1;
      if (arr[key] == arr[mid]) return mid;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int index = BinarySearch3.search(5, arr);
    System.out.println(String.format("index: %s", index));
  }
}
