package org.p99.scala

class P09Spec extends UnitSpec {

  "given a list of consecutive duplicate symbols" should "return a list without consecutive duplicates" in {
    assert(P09.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  "given a list of consecutive duplicate strings" should "return a list without consecutive duplicates" in {
    assert(P09.pack(List("a", "a", "a", "a", "b", "c", "a", "a", "d", "d")) ==
      List(List("a", "a", "a", "a"), List("b"), List("c"), List("a", "a"), List("d", "d")))
  }

  "given a list of consecutive duplicate ints" should "return a list without consecutive duplicates" in {
    assert(P09.pack(List(1,1,1,1,2,2,1,3,3,3,4,4,5)) ==
      List(List(1,1,1,1), List(2,2), List(1), List(3,3,3), List(4,4), List(5)))
  }

}

