
/* http://www.dcs.bbk.ac.uk/~keith/sdp2015/resources/week02/exercises.pdf */

object Exercises1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def getSquare(value: Int) =
    Math.pow(value, 2);                           //> getSquare: (value: Int)Double

  val a = getSquare(3)                            //> a  : Double = 9.0
  assert(a == 9)
  val b = getSquare(6)                            //> b  : Double = 36.0
  assert(b == 36)
  val c = getSquare(5)                            //> c  : Double = 25.0
  assert(c == 25)

}