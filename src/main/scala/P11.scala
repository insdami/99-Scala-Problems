package org.p99.scala

object P11 {
  def encodeModified(elements: List[Any]) = P09.pack(elements).foldLeft(List.empty[Any]) { (list, pack) =>
    pack match {
      case x :: Nil => list :+ x
      case x :: xs => list :+ (pack.size, x)
    }
  }



}
