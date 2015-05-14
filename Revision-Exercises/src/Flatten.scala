object Flatten extends App {
  
  /*
   * How do we do [[1,2,3], [4,5]] -> [1,2,3,4,5] ?
   */
  
  def flatten(seq: Seq[Seq[Int]]) : Seq[Int] = seq match {
    case Nil => Nil
    case head :: tail => head ++ flatten(tail)
  }

  val seq = Seq(Seq(1,2,3), Seq(4,5))
  println (flatten(seq))
  
}