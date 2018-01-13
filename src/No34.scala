/**
  * Created by wqlin on 18-1-13 10:24.
  */
object No34 {
  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    @annotation.tailrec
    def searchLeft(lo: Int, hi: Int): Option[Int] =
      if (lo < hi) {
        val mid = lo + (hi - lo) / 2
        if (nums(mid) < target) searchLeft(mid + 1, hi)
        else searchLeft(lo, mid)
      } else if (nums(lo) == target) Some(lo) else None


    @annotation.tailrec
    def searchRight(lo: Int, hi: Int): Option[Int] =
      if (lo < hi) {
        val mid = lo + (hi - lo) / 2 + 1
        if (nums(mid) > target) searchRight(lo, mid - 1)
        else searchRight(mid, hi)
      } else if (nums(lo) == target) Some(lo) else None

    if (nums.isEmpty) Array(-1, -1)
    else {
      val left = searchLeft(0, nums.length - 1)
      val right = searchRight(0, nums.length - 1)
      (left, right) match {
        case (Some(lo), Some(hi)) => Array(lo, hi)
        case _ => Array(-1, -1)
      }
    }
  }
}