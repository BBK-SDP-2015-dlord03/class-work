object Types extends App {

  type Player = (String, String, Int) // This is a tuple
  type Squad = Seq[Player]
  type Division = Seq[Squad]

  def averageAge(squad: Squad): Double = {
    squad.foldLeft(1)((r, c) => r + c._3) / squad.foldLeft(0)((sum, _) => sum + 1)
  }
  
  val squad: Squad = Seq(("Bobby","Moore",35), ("Gordon","Banks",25), ("Frank","Lampart",22))
  println (averageAge(squad))

}