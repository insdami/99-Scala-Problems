package org.p99.scala

object P05 {
  def reverse(list: List[Any]): List[Any] = list match {
    case Nil => List()
    case null => Nil
    case head :: tail => reverse(tail) ++ List(head)
  }
}
