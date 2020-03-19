package com.bd.sort;

import java.util.Arrays;

/**
 * @author xupeng
 * @date: 18/03/2020
 */
public class QuickSort {
  public void sort(int[] arr, int lo, int hi) {
    System.out.println(Arrays.toString(arr));
    if (lo >= hi) return;
    int j = partition(arr, lo, hi);
    sort(arr, lo, j - 1);
    sort(arr, j + 1, hi);
  }

  public int partition(int[] arr, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    while (true) {
      while (arr[++i] < arr[lo]) if (i == hi) break;
      while (arr[--j] > arr[lo]) if (j == lo) break;
      if (i >= j) break;
      exch(arr, i, j);
    }
    exch(arr, lo, j);
    return j;
  }

  public void exch(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }

  public static void main(String[] args) {
    int[] arr = {6, 4, 5, 3, 22, 1, -1};
    QuickSort quickSort = new QuickSort();
    quickSort.sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
