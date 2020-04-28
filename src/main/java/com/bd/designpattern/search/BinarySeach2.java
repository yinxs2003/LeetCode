package com.bd.designpattern.search;

/**
 * @author xupeng
 * @date: 23/03/2020
 */
public class BinarySeach2 {

  public static int search(int key, int[] arr) {
    int lo = 0;
    int hi = arr.length - 1;
    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (lo > hi) break;
      if (key == arr[mid]) return mid;
      if (key < arr[mid]) hi = mid - 1;
      if (key > arr[mid]) lo = mid + 1;

    }
    return -1;
  }

  public static void main(String[] args) {

//    System.out.println("hello");

    int[] arr = {1,2,3,4,5,6,11};
    int searchedIndex = BinarySeach2.search(1, arr);
    System.out.println(String.format("searchedIndex:%s", searchedIndex));
  }
}
