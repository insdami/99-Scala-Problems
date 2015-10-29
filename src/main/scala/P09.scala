package org.p99.scala

object P09 {
  def pack(elements: List[Any]) = elements.tail.foldLeft(List(List(elements.head))) { (pack, element) =>
    pack.last.head match {
      case `element` => pack.slice(0, pack.indexOf(pack.last)) ++ List(pack.last ++ List(element))
      case _ => pack ++ List(List(element))
    }
  }

  // TODO

}
