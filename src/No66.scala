
/**
  * Created by wqlin on 18-1-17 17:30.
  */
object No66 {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val buffer = new collection.mutable.ArrayBuffer[Int]()
    val c = digits.foldRight(1) { (carry, digit) =>
      buffer += (carry + digit) % 10
      (carry + digit) / 10
    }
    if (c != 0)
      buffer += c
    buffer.reverse.toArray
  }
}
