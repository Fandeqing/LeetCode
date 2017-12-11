/**
  * Created by wqlin on 17-12-11 23:28.
  */
object No35 {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    @annotation.tailrec
    def searchInsert(lo: Int, hi: Int): Int =
      if (lo > hi) if (hi < -1) 0 else if (lo == nums.length) lo else if (nums(lo) > target) lo else lo + 1
      else {
        val mid = lo + (hi - lo) / 2
        if (nums(mid) == target) mid
        else if (nums(mid) < target) searchInsert(mid + 1, hi)
        else searchInsert(lo, mid - 1)
      }

    searchInsert(0, nums.length - 1)
  }
}
