package org.p99.scala

object P09 {
  def pack(elements: List[Any]) = elements.tail.foldLeft(List(List(elements.head))) { (pack, element) =>
    pack.lastOption match {
      case Some(t) if t.head == `element` => pack.dropRight(1) ++ List(pack.last :+ element)
      case _ => pack :+ List(element)
    }
  }

  // TODO

}
