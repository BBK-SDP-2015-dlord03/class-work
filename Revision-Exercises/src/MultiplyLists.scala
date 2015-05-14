object MultiplyLists extends App {
  
  def multiplyList(list: List[Double], value: Double) : List[Double] = list match {
    case Nil => Nil
    case head :: tail => head * value :: multiplyList(tail, value)
  }
  
  def multiplyListWithMap(list: List[Double], value: Double) : List[Double] =  {
    list.map(x => x * value)
  }
  
  val list = List[Double](2,4,5,10)
  
  println(multiplyList(list, 2))
  println(multiplyListWithMap(list, 2))
  
}