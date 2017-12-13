/**
  * Created by wqlin on 17-12-13 13:45.
  */
object No38 {
  private var cache = collection.mutable.HashMap[Int, String](0 -> "1", 1 -> "1")
  private var max = 1

  implicit def intToChar(i: Int): Char = (i + 48).toChar

  def countAndSay(n: Int): String = {
    @annotation.tailrec
    def loop(i: Int, s: String): String =
      if (i == n) {
        max = n
        s
      }
      else {
        var buffer = new StringBuilder
        val res = s.tail.foldLeft((1, s.head)) { case ((count, previous), now) =>
          if (previous == now) (count + 1, now)
          else {
            buffer += (count, previous)
            (1, now)
          }
        }
        buffer += (res._1, res._2)
        val next = buffer.toString
        cache += (i + 1 -> next)
        loop(i + 1, next)
      }

    cache.getOrElse(n, loop(max, cache(max)))
  }
}
