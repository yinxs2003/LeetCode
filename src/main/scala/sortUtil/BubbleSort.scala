package sortUtil

object BubbleSort {
  def swap(num1: Int, num2: Int): Unit = {
    (num1, num2).swap
  }

  def main(args: Array[String]): Unit = {
    var numberArr = Array(21, 2, 24, 1, 5, 777, -1)

    for (i <- 0 to numberArr.length-1) {
      for (j <- 0 to i) {
        if (numberArr(i) > numberArr(j)) {
          var tmp = numberArr(i)
          numberArr(i) = numberArr(j)
          numberArr(j) = tmp
        }
      }
    }

    numberArr.foreach(println)
  }


}
