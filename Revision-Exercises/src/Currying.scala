object Currying extends App {
  
   
  def normalAdd(x: Int, y: Int) = x + y
  
  println (normalAdd(3, 4))
  
  // Add that you can curry
  def add(x: Int) (y: Int): Int = x + y
  
  println (add(3)(4))
  
  // Change it to always add 3 (curry it)
  val add3 = add(3) _
  
  println (add3(4))
  

}