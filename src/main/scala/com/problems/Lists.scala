package com.problems

/**
  * Created by joelpalmer on 4/29/17.
  */
class Lists {
  //Duplicate the elements of a list 1.14
  def duplicate[A](list: List[A]): List[A] = {
    list.flatMap ( el => List(el, el) )
  }

  //get last element in list.
  //Builtin: http://www.scala-lang.org/api/2.12.2/scala/collection/LinearSeq.html#last:A
  //Builtin: http://www.scala-lang.org/api/2.12.2/scala/collection/LinearSeqLike.html#lastOption:Option[A]
  //demo on Lists worksheet
  def getLast[T](list: List[T]): Option[T] = {
    list.lastOption
  }

  //get the K'th element in a list.
  //Builtin: http://www.scala-lang.org/api/2.12.2/scala/collection/IndexedSeq.html#lift:A=>Option[B]
  //demo on Lists worksheet
  def getKth[T](list: List[T], k: Int): Option[T] = {
    list.lift(k)
  }

}
