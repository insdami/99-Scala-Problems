package org.p99.scala

class P16Spec extends UnitSpec {

  "Given a list and a number " should "return a list without those elements" in {
    assert(P16.drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

  "Given a list of elements of different kind and a number " should "return a list without those elements" in {
    assert(P16.drop(3, List('a, "b", 'c, 'd, "e", "f", 'g, 'h, 'i, 'j, 'k))
      == List('a, "b", 'd, "e", 'g, 'h, 'j, 'k))
  }

}

