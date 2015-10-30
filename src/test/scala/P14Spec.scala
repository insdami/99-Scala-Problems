package org.p99.scala

class P14Spec extends UnitSpec {

  "Given a list " should "return a list with duplicated elements" in {
    assert(P14.duplicate(List('a, 'b, 'c, 'c, 'd))
      == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "Given an empty list " should "return an empty list" in {
    assert(P14.duplicate(List.empty) == List.empty)
  }

  "Given a Nil " should "return an empty list" in {
    assert(P14.duplicate(Nil) == List.empty)
  }

  "Given a null " should "return an empty list" in {
    assert(P14.duplicate(null) == List.empty)
  }

}

