package org.p99.scala

object P17 {
  def split(length: Int, elements: List[Any]) = elements.foldLeft((List.empty[Any], List.empty[Any])) { (result, element) =>
    if(elements.indexOf(element) < length)
      (result._1 :+ element, result._2)
    else
      (result._1, result._2 :+ element)
  }
}
