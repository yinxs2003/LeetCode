package com.bd.search;

/**
 * @author xupeng
 * @date: 20/03/2020
 */
public class BinarySearch {
  public static int rank(int key, int[] arr) {
    int lo = 0;
    int hi = arr.length - 1;

    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < arr[mid]) hi = mid - 1;
      if (key > arr[mid]) lo = mid + 1;
      if (key == arr[mid]) return mid;
      else return -1;

    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    int index = BinarySearch.rank(3, arr);
    System.out.println(String.format("index: %s", index));
  }
}
