object Lists {

  val x: List[Int] = List(1, 2, 3, 4, 5)          //> x  : List[Int] = List(1, 2, 3, 4, 5)

  x.last                                          //> res0: Int = 5
  x.length                                        //> res1: Int = 5
  x.init                                          //> res2: List[Int] = List(1, 2, 3, 4)
  x take 2                                        //> res3: List[Int] = List(1, 2)
  x drop 2                                        //> res4: List[Int] = List(3, 4, 5)
  x(3)                                            //> res5: Int = 4

  val y: List[Int] = List(5, 3, 4, 6, 1, 2)       //> y  : List[Int] = List(5, 3, 4, 6, 1, 2)
  x ++ y                                          //> res6: List[Int] = List(1, 2, 3, 4, 5, 5, 3, 4, 6, 1, 2)

  x reverse                                       //> res7: List[Int] = List(5, 4, 3, 2, 1)

  x updated (3, 7)                                //> res8: List[Int] = List(1, 2, 3, 7, 5)

  x indexOf (4)                                   //> res9: Int = 3
  x indexOf 10                                    //> res10: Int = -1

  x contains 3                                    //> res11: Boolean = true

  def mylast[T](xs: List[T]): T = xs match {
    case List() => throw new Error("last element of empty list!")
    case List(x) => x
    case hd :: tl => mylast(tl)
  }                                               //> mylast: [T](xs: List[T])T

  mylast(y)                                       //> res12: Int = 2

  def myconcat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case List() => ys
    case hd :: tl => hd :: myconcat(tl, ys)
  }                                               //> myconcat: [T](xs: List[T], ys: List[T])List[T]

  myconcat(x, y)                                  //> res13: List[Int] = List(1, 2, 3, 4, 5, 5, 3, 4, 6, 1, 2)

  def myreverse[T](xs: List[T]): List[T] = xs match {
    case List() => xs // saves on construction
    case hd :: tl => myreverse(tl) ++ List(hd)
  }                                               //> myreverse: [T](xs: List[T])List[T]

  myreverse(y)                                    //> res14: List[Int] = List(2, 1, 6, 4, 3, 5)

}