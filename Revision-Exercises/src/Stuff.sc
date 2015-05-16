object Stuff {
  var xs: Seq[Int] = List(1, 3, 5, 6, 8)          //> xs  : Seq[Int] = List(1, 3, 5, 6, 8)
  xs filter (x => x > 5)                          //> res0: Seq[Int] = List(6, 8)
  xs filter (x => !(x > 5))                       //> res1: Seq[Int] = List(1, 3, 5)
  xs partition (x => x > 5)                       //> res2: (Seq[Int], Seq[Int]) = (List(6, 8),List(1, 3, 5))
  xs take 3                                       //> res3: Seq[Int] = List(1, 3, 5)
  xs drop 3                                       //> res4: Seq[Int] = List(6, 8)
}