package intro

import minitest._

object EratosthenesTest extends SimpleTestSuite {

  test("Eratosthenes primes") {
    assertEquals(IntroApp.eratosthenesUpTo(2), Seq(2))
    assertEquals(IntroApp.eratosthenesUpTo(10), Seq(2, 3, 5, 7))
  }

}

//object FibonaccisTest extends SimpleTestSuite {
//
//  test("Fibonacci numbers") {
//    assertEquals(IntroApp.fibonaccisUpTo(100), Seq(1, 1, 2))
//    assertEquals(IntroApp.fibonaccisUpTo(100), Seq(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
//  }
//
//}