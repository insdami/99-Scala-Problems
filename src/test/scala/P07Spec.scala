package org.p99.scala


class P07Spec extends UnitSpec {

  "given a list of list" should "return a list with all the involved elements" in {
    assert(P07.flatten(List(List(1,2), List(3,4), List(5,6))) == List(1,2,3,4,5,6))
  }

  "given a list of list and seq" should "return a list with all the involved elements" in {
    assert(P07.flatten(List(List(1,2), Seq(3,4), List(5,6))) == List(1,2,3,4,5,6))
  }

  "given a list of list, seq and Ints" should "return a list with all the involved elements" in {
    assert(P07.flatten(List(List(1,2), Seq(3,4), List(5,6), 7, 8)) == List(1,2,3,4,5,6,7,8))
  }

  "given a list of list, seq, Ints and Strings" should "return a list with all the involved elements" in {
    assert(P07.flatten(List(List(1,2), Seq(3,4), List(5,6), 7, 8, "9", "10")) == List(1,2,3,4,5,6,7,8,"9","10"))
  }

  "given a list of list, seq, Ints, Strings and null" should "return a list with all the involved elements" in {
    assert(P07.flatten(List(List(1,2), Seq(3,4), List(5,6), 7, 8, "9", "10", null)) == List(1,2,3,4,5,6,7,8,"9","10", null))
  }

  "given a list of empty Lists" should "return an empty List" in {
    assert(P07.flatten(List(List.empty, List.empty, List.empty)) == List())
  }

}

