package com.danke

object Test {
  def main(args: Array[String]): Unit = {
    val aList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = aList.reduce((x, y) => x + y);
    println(result)

    println(aList.fold(0)((x, y) => x + y))


    val result3 = aList.aggregate(0,0)((x,y)=>(x._1+y,x._2+1),(x,y)=>(x._1+x._2,y._1+y._2))

  }
}
