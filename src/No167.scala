/**
  * Created by wqlin on 17-10-20 14:36.
  */
object No167 {
  def twoSum(numbers: Array[Int], target: Int, lo: Int, hi: Int): Array[Int] = {
    val s = numbers(lo) + numbers(hi)
    if (s == target)
      Array(lo + 1, hi + 1)
    else if (s < target)
      twoSum(numbers, target, lo + 1, hi)
    else //
      twoSum(numbers, target, lo, hi - 1)
  }

  def twoSum(numbers: Array[Int], target: Int): Array[Int] =
    twoSum(numbers, target, 0, numbers.length - 1)
}
