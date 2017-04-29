package com.problems

/**
  * Created by joelpalmer on 4/29/17.
  */
class Lists {
  def duplicate[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }
}
