/**
  * Created by wqlin on 17-10-19 13:12.
  */
object No53 {
  def maxSubArray(nums: Array[Int]): Int = {
    var res = Int.MinValue
    nums.foldLeft(0)((acc, num) => {
      val t = if (acc < 0) num else acc + num
      res = res max t
      t
    })
    res
  }
}
