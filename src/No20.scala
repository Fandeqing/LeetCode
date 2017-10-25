/**
  * Created by wqlin on 17-10-25 12:45.
  */
object No20 {
  val m = Map('(' -> ')', '{' -> '}', '[' -> ']')

  def isValid(s: String): Boolean = {
    def isValid(i: Int, len: Int, s: String, ls: List[Char]): Boolean =
      if (i == len)
        ls.isEmpty
      else if (s(i) == '(' || s(i) == '{' || s(i) == '[')
        isValid(i + 1, len, s, s(i) :: ls)
      else if (ls.isEmpty)
        false
      else if (s(i) == m(ls.head))
        isValid(i + 1, len, s, ls.tail)
      else
        false

    isValid(0, s.length, s, Nil)
  }
}