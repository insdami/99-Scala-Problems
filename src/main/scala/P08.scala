package org.p99.scala

object P08 {
  def compress(symbols: List[Any]) = symbols.tail.foldLeft(List(symbols.head)) { (compress, symbol) =>
    compress.last match {
      case `symbol` => compress
      case _ => compress :+ symbol
    }
  }
}
