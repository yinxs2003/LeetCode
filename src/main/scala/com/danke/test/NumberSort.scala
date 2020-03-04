package com.danke.test

/**
  * 时间复杂度O(n2)
  */
object NumberSort {

  def sort(numberArr: Array[Int]): Array[Int] = {
    val a = numberArr;

    for (i <- 0 to a.length - 1) {//循环n次
      for (j <- 0 to a.length - 1) {// n+1/2 * n
        if (a(i) < a(j)) {
          val tmp = a(i)
          a(i) = a(j)
          a(j) = tmp
        }
      }
    }
    a
  }

  def sort2(numberArr: Array[Int]): Array[Int] = {
    val a = numberArr;

    for (i <- 0 to a.length - 1) {//循环n次
      for (j <- 0 to i) {// n+1/2 * n
        if (a(i) < a(j)) {
          val tmp = a(i)
          a(i) = a(j)
          a(j) = tmp
        }
      }
    }
    a
  }

  def main(args: Array[String]): Unit = {
    val array = Array(9, 1, 3, 14, 4)
    sort(array).foreach(println)

    val array2 = Array(9, 1, 3, 14, 4)
    sort2(array2).foreach(println)

  }
}
