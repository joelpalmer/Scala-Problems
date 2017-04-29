package com.problems

import org.scalatest.FlatSpec

class ListsTest extends FlatSpec {

  "Lists.duplicate" should "duplicate elements of the list" in {
    val l1 = List("Liam", "Liam", "Sebastian", "Sebastian", "Michelle", "Michelle")
    val l2 = List("Liam", "Sebastian", "Michelle")
    val toDup = new Lists
    assert(l1 == toDup.duplicate(List("Liam", "Sebastian", "Michelle")))
  }

}

