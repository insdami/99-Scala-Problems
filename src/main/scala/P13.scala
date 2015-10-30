package org.p99.scala

object P13 {
  def encodeDirect(elements: List[Any]) = elements.foldLeft(List.empty[(Int, Any)]) { (encoded, element) =>
    encoded.lastOption match {
      case Some(t) if t._2 == `element` => encoded.dropRight(1) :+ (t._1 + 1, element)
      case Some(t) => encoded :+ (1, element)
      case None => encoded :+ (1, element)
    }
  }
}
