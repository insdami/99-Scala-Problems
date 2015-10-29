package org.p99.scala

object P07 {
  def flatten(complexList: List[Any]): List[Any] = complexList.foldLeft(List.empty[Any]) { (flatList, element) =>
    element match {
      case Nil => flatList
      case x :: xs => flatList ++ List(x) ++ flatten(xs)
      case _ => flatList :+ element
    }
  }
}
