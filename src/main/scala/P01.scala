package org.p99.scala



object P01 {

  def last(numbers: List[Int]): Option[Int] = numbers match {
    case Nil | null => None
    case head :: tail => tail match {
      case Nil => Option(head)
      case _ => last(tail)
    }
  }

}
