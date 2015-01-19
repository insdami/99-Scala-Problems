package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  "given a list with 3 elements" should "return list's size" in {
    assert(P04.length(List(1,2,3)) == 3)
  }

  "given an empty list" should "return 0 as list's size" in {
    assert(P04.length(List()) == 0)
  }

  "given a null as parameter" should "return 0" in {
    assert(P04.length(null) == 0)
  }





}

