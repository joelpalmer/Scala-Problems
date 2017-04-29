package com.problems

import org.scalatest.FlatSpec

/**
  * Created by joelpalmer on 4/29/17.
  */
class ListsTest extends FlatSpec {

  "Lists.duplicate" should "duplicate elements of the list" in {
    val l1 = List("Liam", "Liam", "Sebastian", "Sebastian", "Michelle", "Michelle")
    val l2 = List("Liam", "Sebastian", "Michelle")
    val toDup = new Lists
    assert(l1 == toDup.duplicate(List("Liam", "Sebastian", "Michelle")))
  }

}

