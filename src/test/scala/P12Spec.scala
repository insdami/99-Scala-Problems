package org.p99.scala

class P12Spec extends UnitSpec {

  "Given a run-length code symbols list generated " should "return an uncompressed list" in {
    assert(P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
      == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  "Given a run-length code and single symbols list generated " should "return an uncompressed list" in {
    assert(P12.decode(List((4, 'a), (1, 'b), 'c, 'a, (1, 'd), (4, 'e), 'b))
      == List('a, 'a, 'a, 'a, 'b, 'c, 'a, 'd, 'e, 'e, 'e, 'e, 'b))
  }

  "Given a run-length code and single string list generated " should "return an uncompressed list" in {
    assert(P12.decode(List((4, "a"), (1, "b"), "c", "a", (1, "d"), (4, "e"), "b"))
      == List("a", "a", "a", "a", "b", "c", "a", "d", "e", "e", "e", "e", "b"))
  }
}

