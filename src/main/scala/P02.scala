package org.p99.scala

object P02 {

  def penultimate(numbers: List[Any]): Any = numbers match {
    case head :: tail :: Nil => head
    case head :: tail => penultimate(tail)
    case _ => Nil
  }

}
