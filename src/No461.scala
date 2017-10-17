/**
  * Created by wqlin on 17-10-17 09:33.
  */
object Solution {
  def calDistance(x: Int): Int = {
    if (x == 0) 0
    else 1 + calDistance(x & (x - 1))
  }

  def hammingDistance(x: Int, y: Int): Int = {
    calDistance(x ^ y)
  }
}