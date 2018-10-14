/**
  * Created by wqlin on 18-10-14 10:48.
  */
object No33 {
  def search(nums: Array[Int], target: Int): Boolean = {

    @annotation.tailrec
    def search(lo: Int, hi: Int): Boolean =
      if (lo >= hi) nums(lo) == target
      else {
        val m = lo + (hi - lo) / 2
        if (nums(m) == target) true
        else {
          if (nums(lo) < nums(hi)) if (nums(m) < target) search(m + 1, hi) else search(lo, m - 1)
          else if (nums(lo) == target) true else search(lo + 1, hi)
        }

      }

    if (nums.isEmpty) false else search(0, nums.length - 1)
  }
}
