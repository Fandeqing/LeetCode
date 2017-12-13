/**
  * Created by wqlin on 17-12-12 23:59.
  */
object No22 {
  def generateParenthesis(n: Int): List[String] = {
    val buffer = new collection.mutable.ListBuffer[String]

    def loop(left: Int, right: Int, parenthesis: String): Unit =
      if (left == n)
        buffer += parenthesis + Array.fill(left - right)(')').mkString("")
      else {
        (1 to left - right).foldLeft(parenthesis) { (p, i) =>
          loop(left + 1, right + i, p + ')' + '(')
          p + ')'
        }
        loop(left + 1, right, parenthesis + '(')
      }

    loop(0, 0, "")

    buffer.toList
  }
}
