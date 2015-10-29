package org.p99.scala

class P11Spec extends UnitSpec {

  "given a list of consecutive duplicate symbols" should
    "return a list number of duplicates of the element, leaving as a single element the one non-duplicated" in {
    assert(P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }


}

