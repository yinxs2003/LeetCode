package com.danke.test
import scala.math._

object HelloWorld {

  class Point(xc: Int, yc: Int) {
    var x: Int = xc
    var y: Int = yc

    def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
    }

    def distance: Double ={
      val tmp = x*x + y* y
      println(tmp)
      sqrt(tmp)
    }

    override def toString: String = x + ", " + y
  }


  def main(args: Array[String]): Unit = {
    val p = new Point(1, 1)
    println(p)

    p.move(1,2)
    println(p)

    println(p.distance)

    println("Hello, world!")
  }
}