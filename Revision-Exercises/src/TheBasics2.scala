

import scala.annotation.tailrec

object TheBasics2 extends App {

  def factorial(n: Int): Int = {
    
	  @tailrec
    def fact(n:Int, accumulator: Int): Int = {
    		if (accumulator == 0) n 
    		else fact(n * accumulator, accumulator -1)
    } 

    fact(n, n - 1)
    
  }

  println(5 * 4 * 3 * 2 * 1)
  println(factorial(5))

}