/**
  * Created by wqlin on 17-10-17 16:01.
  */
object No1 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val m = nums.zipWithIndex.groupBy(_._1)
    nums.zipWithIndex.filter(pair => {
      val diff = target - pair._1
      m.contains(diff) && m(diff).exists(_._2 != pair._2)
    }).map(_._2)
  }
}