/**
  * Created by wqlin on 18-1-23 10:56.
  */
object No485 {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    val pair = nums.foldLeft((0, 0)) { case ((count, maxCount), num) =>
      if (num == 0) (0, maxCount max count)
      else (count + 1, maxCount)
    }
    pair._1 max pair._2
  }
}
