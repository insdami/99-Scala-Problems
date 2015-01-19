package org.p99.scala



object P01 {

  def last(numbers: List[Int]): Any = numbers match {
    case head :: Nil  => head
    case head :: tail => last(tail)
    case _ => Nil
  }

}
