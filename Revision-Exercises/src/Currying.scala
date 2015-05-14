object Currying extends App {
  
  def add(x: Int) (y: Int): Int = x + y
  
  // Change it to always add 3 (curry it)
  val add3 = add(3) _
  
  println (add3(5))
  

}