package org.p99.scala

object P01 {

  def last(numbers: List[Int]): Option[Int] = numbers match {
    case Nil => None
    case list => list.tail match {
      case Nil => Option(list.head)
      case tail => last(tail)
    }
  }

}
