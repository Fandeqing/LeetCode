/**
  * Created by wqlin on 17-10-25 09:31.
  */
object No13 {
  val m = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

  def romanToInt(s: String): Int =
    (s zip s.tail).foldLeft(0)((s, c) => if (m(c._1) < m(c._2)) s - m(c._1) else s + m(c._1)) + m(s.last)

}
