package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  "given a list with items" should
    "returns last item" in {
      val list = List(1, 1, 2, 3, 5, 8)
      assert(P01.last(list) == 8)
  }

  "given a list with one item" should "return the only existing item" in {
    assert(P01.last(List(1)) == 1)
  }

  "given an empty list" should "return Nil" in {
    assert(P01.last(List()) == Nil)
  }

  "given a null" should "return Nil" in {
    assert(P01.last(null) == Nil)
  }

}

