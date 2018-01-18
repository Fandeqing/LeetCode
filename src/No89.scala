/**
  * Created by wqlin on 18-1-18 20:28.
  */
object No89 {
  def grayCode(n: Int): List[Int] =
    if (n <= 0) List(0)
    else {
      val prev = grayCode(n - 1)
      prev ::: prev.map(i => i | (1 << (n - 1))).reverse
    }
}
