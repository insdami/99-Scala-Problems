package org.p99.scala

object P04 {
  def length(list: List[Any]): Any = count(0, list)

  private def count(fromPosition: Int = 0, list: List[Any]): Int = list match {
    case Nil | null  => fromPosition
    case head :: tail => count(fromPosition + 1, tail)
  }

}
