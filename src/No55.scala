/**
  * Created by wqlin on 17-11-20 18:49.
  */
object No55 {
  def canJump(nums: Array[Int]): Boolean = {
    @annotation.tailrec
    def canJump(i: Int, len: Int, farthest: Int): Boolean = {
      if (i == len - 1) farthest >= i
      else if (farthest < i) false
      else if (i + nums(i) > farthest) canJump(i + 1, len, i + nums(i))
      else canJump(i + 1, len, farthest)
    }

    canJump(0, nums.length, 0)
  }
}
