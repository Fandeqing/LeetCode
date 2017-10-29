/**
  * Created by wqlin on 17-10-29 14:56.
  */
object No283 {
  def moveZeroes(nums: Array[Int]): Unit = {
    val index = nums.foldLeft(0) {
      (i, num) =>
        if (num != 0) {
          nums(i) = num
          i + 1
        } else
          i
    }
    (index until nums.length).foreach(nums(_) = 0)
  }
}