package org.p99.scala

class P10Spec extends UnitSpec {

  "given a list of consecutive duplicate symbols" should "return a list without consecutive duplicates" in {
    assert(P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}

