/**
  * Created by wqlin on 18-1-21 09:49.
  */
object No693 {
  def hasAlternatingBits(n: Int): Boolean = {
    def hasOnlyOneBit(n: Int): Boolean =
      (n & (n - 1)) == 0

    val t = n ^ (n >> 1)
    hasOnlyOneBit(t ^ (t >> 1))
  }
}
