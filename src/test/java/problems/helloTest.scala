package problems

import org.scalatest.FunSuite

/**
  * Created by joelpalmer on 4/29/17.
  */
class helloTest extends FunSuite {

  test("testSayHello") {
    val hello = new hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }

}
