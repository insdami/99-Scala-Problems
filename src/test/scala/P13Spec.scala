package org.p99.scala

class P13Spec extends UnitSpec {

  "Given a run-length encoding of a list " should "return a run-length encoding data compression list" in {
    assert(P13.encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
      == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  "Given an empty List " should "return a empty List" in {
    assert(P13.encodeDirect(List()) == List())
  }


  "Given a run-length encoding of a list within different kind of elements " should "return a run-length encoding data compression list" in {
    assert(P13.encodeDirect(
         List('a, "a", "a", 'a, 'b, 'c, 'c, 'a, 'a, 'd, "e", 'e, 'e, 'e))
      == List((1,'a), (2, "a"), (1, 'a), (1,'b), (2,'c), (2,'a), (1,'d), (1, "e"), (3,'e)))
  }


}

