package org.p99.scala

class P18Spec extends UnitSpec {

  "Given a list and a range" should "return a list within requested elements based on the range" in {
    assert(P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
      == List('d, 'e, 'f, 'g))
  }

  "Given an empty list and a range" should "return an empty list" in {
    assert(P18.slice(3, 7, List.empty)
      == List.empty)
  }

  "Given an empty list and a range that includes all the indexes" should "return the list except the last" in {
    assert(P18.slice(0, 2, List('a, 'b, 'c))
      == List('a, 'b))
  }

  "Given a null as a list and a range" should "return an empty list" in {
    assert(P18.slice(3, 7, null)
      == List.empty)
  }

  "Given a list and a range over the valid values" should "return an empty list" in {
    assert(P18.slice(4, 6, List('a, 'b, 'c))
      == List.empty)
  }

  "Given a list and a range under the valid values" should "return an empty list" in {
    assert(P18.slice(-1, 0, List('a, 'b, 'c))
      == List.empty)
  }

  "Given a list and a range which has 'from' value bigger than 'to' " should "return an empty list" in {
    assert(P18.slice(3, 2, List('a, 'b, 'c))
      == List.empty)
  }

}

