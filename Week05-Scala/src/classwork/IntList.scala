package classwork

// Recursive Algebraic Data Type Pattern

sealed trait IntList {

  /*
   * 
  def sum(total: Int = 0): Int =
    this match {
      case EndOfList => total
      case Pair(hd, tl) => tl.sum(hd + total)
    }

  def product(total: Int = 1): Int =
    this match {
      case EndOfList => total
      case Pair(hd, tl) => tl.product(hd * total)
    }

  def length(total: Int = 0): Int =
    this match {
      case EndOfList => total
      case Pair(hd, tl) => tl.length(1 + total)
    }

  */

  def abstraction(end: Int, f: (Int, Int) => Int): Int =
    this match {
      case EndOfList => end
      case Pair(hd, tl) => f(hd, tl.abstraction(end, f))
    }

  def sum: Int =
    abstraction(0, (hd, tl) => hd + tl)

  def product =
    abstraction(0, (hd, tl) => hd * tl)

  def length: Int =
    abstraction(0, (_, tl) => 1 + tl)

}

final case class Pair(head: Int, tail: IntList) extends IntList

final case object EndOfList extends IntList

object Main extends App {

  def list = Pair(1, Pair(2, Pair(3, Pair(4, EndOfList))))

  println(list)
  println(nonRecusiveSum(list))
  println(list.sum)
  println(list.product)
  println(list.length)
  println(double(list))

  // Not tail recursive.
  def nonRecusiveSum(list: IntList): Int =
    list match {
      case EndOfList => 0
      case Pair(hd, tl) => hd + sum(tl)
    }

  def sum(list: IntList, total: Int = 0): Int =
    list match {
      case EndOfList => total
      case Pair(hd, tl) => sum(tl, hd + total)
    }

  def product(list: IntList, total: Int = 1): Int =
    list match {
      case EndOfList => total
      case Pair(hd, tl) => product(tl, hd * total)
    }

  def length(list: IntList, total: Int = 0): Int =
    list match {
      case EndOfList => total
      case Pair(hd, tl) => length(tl, 1 + total)
    }

  def double(list: IntList): IntList = {
    list match {
      case EndOfList => EndOfList
      case Pair(hd, tl) => Pair(hd * 2, double(tl))
    }

  }

}