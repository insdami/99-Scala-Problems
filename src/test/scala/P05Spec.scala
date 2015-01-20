package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  "given a list of elements" should "return the same elements but with reverse order" in {
    assert(P05.reverse(List(1,2,3)) == List(3,2,1))
  }

  "given an empty list" should "return an empty list as well" in {
    assert(P05.reverse(List()) == List())
  }

  "given a null as parameter" should "return Nil" in {
    assert(P05.reverse(null) == Nil)
  }

  "given a list with one element" should "return the same list" in {
    assert(P05.reverse(List(1)) == List(1))
  }

}

