package revision

import scala.annotation.tailrec;

object PolymorphicFunctions extends App {

  def findFirst(as: Array[String], value: String): Int = {
    @tailrec
    def helper(n: Int): Int =
      if (n >= as.length) -1
      else if (as(n) == value) n
      else helper(n + 1)
    helper(0)
  }

  println(findFirst(Array("January", "February", "March", "April", "May", "June", "July"), "May"))
  println(findFirst(Array("January", "February", "March", "April", "May", "June", "July"), "Movember"))

  /*
   * Make it polymorphic...
   */
  def genericFindFirst[T](as: Array[T], value: T): Int = {
    @tailrec
    def helper(n: Int): Int =
      if (n >= as.length) -1
      else if (as(n) == value) n
      else helper(n + 1)
    helper(0)
  }

  println(genericFindFirst(Array("January", "February", "March", "April", "May", "June", "July"), "May"))
  println(genericFindFirst(Array("January", "February", "March", "April", "May", "June", "July"), "Movember"))

  def isSorted[T](as: Array[T], greaterThan: (T, T) => Boolean): Boolean = {
    /*
     * The array is not sorted if two elements are not in order.
     */
    def helper(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (greaterThan(as(n), as(n + 1))) false
      else helper(n + 1)

    helper(0)
  }

  def gt(x: Int, y: Int): Boolean =
    x > y

  println(isSorted(Array(1, 2, 3, 4), gt))
  println(isSorted(Array(1, 2, 4, 3), gt))
  println(isSorted(Range(1, 100).toArray, gt))
  println(isSorted(Range(1, 100).toArray, (a: Int, b: Int) => a > b))

  /*
   * Generic Revision.
   * Java                               Scala
   * ====                               =====
   * T extends xxxxx
   * T extends ?                        <:
   * T super ?                          >:
   * Student extends Person
   * Pair[Student] <=> Pair[Person]
   * 
   * NO EQUIVALENT (Implicit)           <%
   * 
   */

  def isSortedWildcard[T <% Comparable[T]](as: Array[T], greaterThan: (T, T) => Boolean): Boolean = {
    /*
     * The array is not sorted if two elements are not in order.
     */
    def helper(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (greaterThan(as(n), as(n + 1))) false
      else helper(n + 1)

    helper(0)

  }

  println(isSortedWildcard(Array(1, 2, 3, 4), gt))
  println(isSortedWildcard(Array(1, 2, 4, 3), gt))
  println(isSortedWildcard(Range(1, 100).toArray, gt))
  println(isSortedWildcard(Range(1, 100).toArray, (a: Int, b: Int) => a > b))

}