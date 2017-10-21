/**
  * Created by wqlin on 17-10-21 09:59.
  */
object No52 {
  def totalNQueens(n: Int): Int = {
    def findNQueens(k: Int): List[List[(Int, Int)]] = {
      if (k == 0)
        List(List())
      else for {
        queens <- findNQueens(k - 1)
        column <- 0 until n
        if isSafe((k - 1, column), queens)
      } yield (k - 1, column) :: queens
    }

    def isSafe(queen: (Int, Int), queens: List[(Int, Int)]): Boolean =
      queens.forall(p => !inCheck(queen, p))


    def inCheck(q1: (Int, Int), q2: (Int, Int)): Boolean =
      q1._1 == q2._1 || q1._2 == q2._2 || (q1._1 - q2._1).abs == (q1._2 - q2._2).abs

    findNQueens(n).length
  }
}
