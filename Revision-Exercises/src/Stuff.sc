object Stuff {

var xs:Seq[Int] = List(1,3,5,6,8)                 //> xs  : Seq[Int] = List(1, 3, 5, 6, 8)
xs filter (x => x > 5)                            //> res0: Seq[Int] = List(6, 8)
xs filter (x => !(x > 5))                         //> res1: Seq[Int] = List(1, 3, 5)
xs partition (x => x > 5)                         //> res2: (Seq[Int], Seq[Int]) = (List(6, 8),List(1, 3, 5))
xs take 3                                         //> res3: Seq[Int] = List(1, 3, 5)
xs drop 3                                         //> res4: Seq[Int] = List(6, 8)
def f(x: Int, y: Int) = { x + y}                  //> f: (x: Int, y: Int)Int
f(3,4)                                            //> res5: Int = 7

def ff(x: Int)(y:Int) = x + y                     //> ff: (x: Int)(y: Int)Int

ff(3)(4)                                          //> res6: Int = 7

val x = ff(3)_                                    //> x  : Int => Int = <function1>
x                                                 //> res7: Int => Int = <function1>
x(4)                                              //> res8: Int = 7
x(5)                                              //> res9: Int = 8


}