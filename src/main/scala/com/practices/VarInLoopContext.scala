package com.practices

/**
  * Created by joelpalmer on 4/30/17.
  */
object VarInLoopContext {
  case class Foo(i : Int)

  def myFunction(input : List[Foo]) : Int = {
    input.map(i => i.i).filter(i => i%2 == 0).sum
  }
  def main (args: Array[String] ): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9,10)
    val listOfFoo = list.map(Foo)
    println(myFunction(listOfFoo))

  }

}