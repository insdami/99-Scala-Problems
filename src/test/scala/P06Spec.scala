package org.p99.scala


class P06Spec extends UnitSpec {

  "given a list with elements which his sequence repeats after the 3rd" should "return that is a palindrome" in {
    assert(P06.isPalindrome(List(1,2,3,2,1)))
  }

  "given an empty list" should "return that is a palindrome list" in {
    assert(P06.isPalindrome(List()))
  }

  "given a even list of elements" should "return that is a palindrome list" in {
    assert(P06.isPalindrome(List(1,2,3,3,2,1)))
  }

  "given a list non-palindrome" should "return false" in {
    assert(!P06.isPalindrome(List(1,2,3)))
  }

}

