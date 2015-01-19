package org.p99.scala


class P03Spec extends UnitSpec {

  "given 2 as a position and list of numbers" should "return the item in that position" in {
    assert(P03.nth(2, List(3,4,5,6)) == 5)
  }

  "given 3 as a position and a list of characters" should "return the item in that position" in {
    assert(P03.nth(3, List('a','b','b','c','d','e')) == 'c')
  }

  "given an out of index position" should "return Nil" in {
    assert(P03.nth(5, List(1,2,3)) == Nil)
  }

  "given an empty list" should "return Nil" in {
    assert(P03.nth(5, List()) == Nil)
  }

  "given an null list" should "return Nil" in {
    assert(P03.nth(0, null) == Nil)
  }

}

