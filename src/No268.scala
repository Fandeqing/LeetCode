/**
  * Created by wqlin on 18-1-14 10:44.
  */
object No268 {
  def missingNumber(nums: Array[Int]): Int = {
    val t = (0 to nums.length).foldLeft(0)(_ ^ _)
    nums.foldLeft(t)(_ ^ _)
  }
}
