package generics

object Func extends App {

  /*
   * "Currying" http://en.wikipedia.org/wiki/Currying
   * 
   * A generic function that takes a parameter of type A and a parameter of type function 
   * taking A and B and returning C and then returns another function which takes a 
   * parameter of type B and returns a C. 
   */
  def part[A, B, C](a: A, fn: (A, B) => C): B => C =
    (b: B) => fn(a, b)

  //Now call it.
  val add3 = part(3, (a: Int, b: Int) => a + b)
  val add10 = part(10, (a: Int, b: Int) => a + b)

  //these two vals are now functions which we can call with another parameter.
  println(add3(6))
  println(add10(9))

  def compose[A <% Comparable[A], B <% Comparable[B], C <% Comparable[C]](f: B => C, g: A => B): A => C =
    a => f(g(a))

  val double = (x: Double) => 2.0 * x
  val squared = (x: Double) => x * x

  val composed = compose(double, squared)
  println(composed)
  println(composed(10))
  
  // infix
  val x = double compose squared 
  println(x(5))

  // or
  println((double compose squared)(8))

}