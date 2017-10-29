/**
  * Created by wqlin on 17-10-17 09:33.
  */
object No461 {
  def calDistance(x: Int, acc: Int): Int = {
    if (x == 0) acc
    else calDistance(x & (x - 1), 1 + acc)
  }

  def hammingDistance(x: Int, y: Int): Int = {
    calDistance(x ^ y, 0)
  }
}