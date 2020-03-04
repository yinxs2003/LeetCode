package sortUtil;

import java.util.Arrays;

/**
 * @author xupeng
 * @date: 25/02/2020
 */
public class QuickSort {
  void quicksort(int[] a, int left, int right) {
    int i, j, t, temp;
    if (left > right) {//递归返回
      return;
    }

    temp = a[left];
    i = left;
    j = right;
    while (i != j) {
      while (a[j] >= temp && i < j) {
        j--;
      }

      while (a[i] <= temp && i < j) {
        i++;
      }

      if (i < j) {
        t = a[i];
        a[i] = a[j];
        a[j] = t;
      }
    }

    a[left] = a[i];
    a[i] = temp;
//    System.out.println(Arrays.toString(a));

    quicksort(a, left, i-1);
    quicksort(a, j+1, right);
  }

  public static void main(String[] args) {

    QuickSort q = new QuickSort();
    int[] a = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
    q.quicksort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }
}
