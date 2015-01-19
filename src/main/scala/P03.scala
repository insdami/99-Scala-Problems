package org.p99.scala

object P03 {

  def nth(position: Int, list: List[Any]): Any = list match {
    case Nil | null => Nil
    case head :: tail => position match {
      case 0 => head
      case _ => nth(position - 1, tail)
    }
  }

}
