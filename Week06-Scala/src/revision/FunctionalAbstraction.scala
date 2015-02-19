package revision

object FunctionalAbstraction extends App {

  // Recursion
  def factorial(n: Int): Int = {
    def helper(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else helper(n - 1, n * acc)

    helper(n, 1)
  }

  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  println("Functions...")
  println(factorial(5))
  println(abs(-15))

  def prettyAbsMsg(x: Int) = {
    s"The asbolute value of $x is ${abs(x)}"
  }

  def prettyFactorialMsg(x: Int) = {
    s"The factorial of $x is ${factorial(x)}"
  }

  println("\nSimilar Functions...")
  println(prettyFactorialMsg(6))
  println(prettyAbsMsg(-15))

  /* Functional Abstraction -- High Order Function
   * Takes a function as an argument.
   */
  def prettyMsg(msg: String, x: Int, f: Int => Int): String = {
    s"$msg $x is ${f(x)}"
  }
  
  println("\nFunctional Abstraction (High Order Functions)...")
  println(prettyMsg("The factorial of ", 5, factorial))
  println(prettyMsg("The absolute value of", -12, abs))

}