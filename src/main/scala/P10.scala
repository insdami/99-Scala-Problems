package org.p99.scala

object P10 {

  def encode(elements: List[Any]) = P09.pack(elements).foldLeft(List.empty[(Int, Any)])((list, pack) =>
    list :+ (pack.size, pack.head))

}
