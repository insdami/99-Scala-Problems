package org.p99.scala

class P17Spec extends UnitSpec {

  "Given a list and a length" should "return a splitted list where the first list has the requested length" in {
    assert(P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      == (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  "Given a list and zero length value" should "return a tuple where the first is an empty list, leaving the original list as a second" in {
    assert(P17.split(0, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      == (List.empty,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  "Given an empty list and a length value" should "return a tuple with empty lists" in {
    assert(P17.split(3, List.empty) == (List.empty,List.empty))
  }

}

