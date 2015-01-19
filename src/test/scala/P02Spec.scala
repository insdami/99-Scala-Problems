package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {

  "given a list of numbers" should "return the last but one" in {
    assert(P02.penultimate(List(1,2,2,3,4)) == 3)
  }

  "given a list with only one number" should "return Nil" in {
    assert(P02.penultimate(List(1)) == Nil)
  }

  "given an empty list" should "return Nil" in {
    assert(P02.penultimate(List()) == Nil)
  }

  "given a null as parameter" should "return Nil" in {
    assert(P02.penultimate(null) == Nil)
  }

  "given list of charactes" should "return the las but one" in {
    assert(P02.penultimate(List('a','b','b','c','d')) == 'c')
  }
}

