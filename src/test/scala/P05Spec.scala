package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  "given a list of elements" should "return the same elements but with reverse order" in {
    assert(P05.reverse(List(1,2,3)) == List(3,2,1))
  }

}

