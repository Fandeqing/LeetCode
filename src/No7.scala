/**
  * Created by wqlin on 17-12-12 23:04.
  */
object No7 {
  def reverse(x: Int): Int = {
    @annotation.tailrec
    def loop(i: Int, acc: Int): Int =
      if (i == 0) if (x < 0) -acc else acc
      else {
        val t = acc * 10
        if (t / 10 != acc) 0 else loop(i / 10, t + i % 10)
      }

    loop(x.abs, 0)
  }
}
