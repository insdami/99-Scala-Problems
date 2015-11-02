package org.p99.scala

object P18 {
  def slice(from: Int, to: Int, elements: List[Any]) = {

    def cut (from: Int, to: Int, original: List[Any], cutList:List[Any] = List.empty ): List[Any] = {
      if(from == to
        || original == Nil
        || original == null
        || (from > to || from > original.size - 1 || to > original.size - 1)
        || (from < 0)
      )
        cutList
      else
        cut(from + 1, to, original, cutList :+ original(from))
    }
    cut(from, to, elements)
  }

}
