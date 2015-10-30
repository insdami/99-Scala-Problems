package org.p99.scala

class P15Spec extends UnitSpec {

  "Given a list " should "return a list within duplicated n times the elements" in {
    assert(P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd))
      == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

  "Given a list and 1 times to duplicate " should "return a list within non-duplicated elements" in {
    assert(P15.duplicateN(1, List('a, 'b, 'c, 'c, 'd))
      == List('a, 'b, 'c, 'c, 'd))
  }

  "Given a list and 0 times to duplicate " should "return a list within non-duplicated elements" in {
    assert(P15.duplicateN(0, List('a, 'b, 'c, 'c, 'd))
      == List('a, 'b, 'c, 'c, 'd))
  }

  "Given an empty list " should "return an empty list" in {
    assert(P15.duplicateN(3, List.empty)
      == List.empty)
  }

}

