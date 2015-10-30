package org.p99.scala

object P15 {
  def duplicateN(times: Int, elements: List[Any]) =
    if (elements == null)
      List.empty[Any]
    else if (times < 1)
      elements
    else
      elements.foldLeft(List.empty[Any])((duplicatedList, element) => duplicatedList ++ List.fill(times)(element))

  // TODO

}
