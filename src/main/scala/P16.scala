package org.p99.scala

object P16 {
  def drop(everyNth: Int, elements: List[Any]) =
    if(elements == null)
      List.empty
    else if(everyNth < 1)
      elements
    else
      elements.foldLeft(List.empty[Any])((droppedList, element) =>
        if((elements.indexOf(element) + 1) % everyNth != 0)
          droppedList :+ element
        else
          droppedList
      )
}
