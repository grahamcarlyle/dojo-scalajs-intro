package intro

import scala.annotation.tailrec
import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery

object IntroApp extends JSApp {

  def main(): Unit = {
    println("Hello world!")
    val limit = 20
    println(s"""The primes numbers up to ${limit} are ${primesUpTo(limit).mkString(",")}""")
    jQuery("#msg").text("Goodbye!")

  }

  def primesUpTo(limit: Int): Seq[Int] = {
    eratosthenesUpTo(limit)
  }

  /** Sieve of Eratosthenes means of finding prime numbers
    *
   *  http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
   */
  def eratosthenesUpTo(limit: Int): Seq[Int] = {
    @tailrec
    def collectPrimes(primeHeadedSeq: Seq[Int], collectedPrimes: Seq[Int]): Seq[Int] = {
      val prime = primeHeadedSeq.head
      val candidates = primeHeadedSeq.tail
      val withoutPrimeMultiples = candidates.filter(_ % prime != 0)
      if (withoutPrimeMultiples.isEmpty)
        collectedPrimes :+ prime
      else
        collectPrimes(withoutPrimeMultiples, collectedPrimes :+ prime)
    }
    collectPrimes(2 to limit, Vector.empty)
  }

  def fibonaccisUpTo(limit: Int): Seq[Int] = ???
}
