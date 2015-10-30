package org.p99.scala

object P12 {
  def decode(elements: List[Any]) = elements.foldLeft(List.empty[Any]){ (decoded, element) =>
    element match {
      case tuple:(Int, Any) => decoded ++ List.fill(tuple._1)(tuple._2)
      case single:Any => decoded :+ single
    }
  }
}
