package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  "given a list with items" should
    "returns last item" in {
      val list = List(1, 1, 2, 3, 5, 8)
      assert(P01.last(list).get == 8)
  }

  "given a list with one item" should "return the only existing item" in {
    assert(P01.last(List(1)).get == 1)
  }

  "given an empty list" should "return a None" in {
    assert(P01.last(List()) == None)
  }

  "given a null" should "return None" in {
    assert(P01.last(null) == None)
  }

}

