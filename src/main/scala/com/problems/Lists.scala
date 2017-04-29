package com.problems

/**
  * Created by joelpalmer on 4/29/17.
  */
class Lists {
  def duplicate[A](list: List[A]): List[A] = {
    list.flatMap ( el => List(el, el) )
  }
}
