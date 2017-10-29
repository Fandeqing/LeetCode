/**
  * Created by wqlin on 17-10-29 11:07.
  */
object No136 {
  def singleNumber(nums: Array[Int]): Int =
    nums.foldLeft(0)((res, num) => res ^ num)
}
