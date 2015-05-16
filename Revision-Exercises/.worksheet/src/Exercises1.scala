
/* http://www.dcs.bbk.ac.uk/~keith/sdp2015/resources/week02/exercises.pdf */

object Exercises1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(142); 
  println("Welcome to the Scala worksheet");$skip(55); 

  def getSquare(value: Int) =
    Math.pow(value, 2);System.out.println("""getSquare: (value: Int)Double""");$skip(24); ;

  val a = getSquare(3);System.out.println("""a  : Double = """ + $show(a ));$skip(17); 
  assert(a == 9);$skip(23); 
  val b = getSquare(6);System.out.println("""b  : Double = """ + $show(b ));$skip(18); 
  assert(b == 36);$skip(23); 
  val c = getSquare(5);System.out.println("""c  : Double = """ + $show(c ));$skip(18); 
  assert(c == 25)}

}
