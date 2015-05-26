object Currying extends App {
  
   
  def normalAdd(x: Int, y: Int) = x + y
  
  println (normalAdd(3, 4))
  
  // Add that you can curry (with two argument lists)
  def add(x: Int) (y: Int): Int = x + y
  
  // Calling the two argument list version
  println (add(3)(4))
  
  // Curry it by setting the first parameter list to 3 and leaving the second one hanging
  val add3 = add(3) _
  
  // Call the new curried function.
  println (add3(4))
  
  def line(a: Int, b: Int, x: Int): Int = a * x + b  

  def curriedLine(a: Int)(b: Int)(x: Int): Int = line(a, b, x)

  def defaultLine(x: Int): Int = curriedLine(1)(0)(x)
  
  println (defaultLine(5))
  
  def partialLine = (b: Int, x: Int) => line(2, b, x)
  
  println (partialLine(0, 1))
  
}