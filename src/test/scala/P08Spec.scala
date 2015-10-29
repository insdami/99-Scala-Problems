package org.p99.scala



class P08Spec extends UnitSpec {

  "given a list of consecutive duplicate symbols" should "return a list without consecutive duplicates" in {
    assert(P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "given a list of consecutive duplicate strings" should "return a list without consecutive duplicates" in {
    assert(P08.compress(List("a", "a", "b", "b", "a", "c", "c")) == List("a", "b", "a", "c"))
  }

  "given a list of consecutive duplicate ints" should "return a list without consecutive duplicates" in {
    assert(P08.compress(List(1,1,2,1,3,3,3)) == List(1,2,1,3))
  }

}

