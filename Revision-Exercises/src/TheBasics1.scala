
/* http://www.dcs.bbk.ac.uk/~keith/sdp2015/resources/basics.pdf */

/**
 * @author dlord03
 */
object Main extends App {
  
  println(One.sqrtIter(0.5, 0.000025)) //0.005
  println(One.sqrtIter(0, 25)) //0.005
  println(One.sqrtIter(1, 25)) //0.005

}

object One {

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double): Boolean =
    if (x == 0 || guess == 0) true else
    abs(square(guess) - x) < 0.001 * x

  def sqrt(x: Double) = sqrtIter(1.0, x)

  def square(x: Double) = x * x

  def abs(x: Double) = if (x > 0) x else -x
}



