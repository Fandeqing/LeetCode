/**
  * Created by wqlin on 17-10-29 10:02.
  */
object No88 {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int, index: Int): Unit = {
      if (index < 0) Unit
      else if (m >= 0 && n >= 0) {
        if (nums1(m) > nums2(n)) {
          nums1(index) = nums1(m)
          merge(nums1, m - 1, nums2, n, index - 1)
        }
        else {  // nums2(n) >= nums1(m)
          nums1(index) = nums2(n)
          merge(nums1, m, nums2, n - 1, index - 1)
        }
      } else if (n >= 0) {
        nums1(index) = nums2(n)
        merge(nums1, m - 1, nums2, n - 1, index - 1)
      }
    }

    merge(nums1, m - 1, nums2, n - 1, m + n - 1)
  }
}
