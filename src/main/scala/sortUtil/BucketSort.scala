package sortUtil

object BucketSort {
  def sort(numberArr: Array[Int]): Array[Int] = {
    var max = numberArr(0)
    var min = numberArr(0)
    for (i <- numberArr) {
      if (max < i) max = i
      if (min > i) min = i
    }

    val bucketArr = new Array[Int](max + 1)
    for (i <- numberArr)
      bucketArr(i) += 1
    bucketArr
  }


  def main(args: Array[String]): Unit = {
    val numberArr = Array(33, 123, 321, 2, 5, 2, 11)

    var bucketArr = sort(numberArr)

    for (bucketIndex <- 0 to bucketArr.length - 1) {
      //m次
      var bucketIndexValue = bucketArr(bucketIndex)
      if (bucketIndexValue > 0) {
        while (bucketIndexValue > 0) {
          //n次
          print(bucketIndex + " ")
          bucketIndexValue -= 1
        }
      }
    }
  }
}
