sealed trait EvaluationTree
final case class Term(i: Int) extends EvaluationTree
final case class Func(s: String, args: Seq[EvaluationTree]) extends EvaluationTree

object EvaluationTree {
  
  def print (e: EvaluationTree): String = e match {
    case Term(i) => i.toString()
    case Func(s, args) => s"Func($s, ${printSeq(args)})"
  }
  
  def printSeq(seq: Seq[EvaluationTree]): String = seq match {
    case Nil => ""
    case head :: tail => print(head) + ", " + printSeq(tail)
    case s :: Nil => print(s)
  }

}