package org.p99.scala

object P14 {
  def duplicate(elements: List[Any]) =
    if(elements == null)
      List.empty
    else
      elements.foldLeft(List.empty[Any])((duplicatedList, element) => duplicatedList ++ List.fill(2)(element))

}
