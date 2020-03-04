package com.danke.test

import org.apache.spark.{SparkConf, SparkContext}
import org.slf4j.LoggerFactory

object groupByKeyTest {
  private val log = LoggerFactory.getLogger(classOf[Nothing])

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("GroupByKey").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("WARN")
    sc.setCheckpointDir("/tmp/checkpoint")

    val data = Array[(Int, Char)]((1, 'a'), (2, 'b'),
      (3, 'c'), (4, 'd'),
      (5, 'e'), (3, 'f'),
      (2, 'g'), (1, 'h')
    )
    val pairs = sc.parallelize(data, 3)

    pairs.cache
    pairs.checkpoint
    pairs.count

    pairs.foreach(println)
    println

    val result = pairs.groupByKey(2)
    result.foreach(println)

    println

    val reduced = pairs.map(dataTuple => (dataTuple._1, Set(dataTuple._2))).reduceByKey(_ ++ _)
    reduced.foreach(println)

    println

    val zeroValue = collection.mutable.Set[String]()

    //合并在同一个partition中的值，x的数据类型为zeroValue的数据类型，y的数据类型为原value的数据类型
    val aggregated = pairs.aggregateByKey(zeroValue)((x, y) => collection.mutable.Set[String](y.toString), (setOne, setTwo) => setOne ++= setTwo)
    aggregated.foreach(println)
  }
}