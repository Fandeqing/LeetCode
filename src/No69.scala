/**
  * Created by wqlin on 17-10-28 11:38.
  */
object No69 {
  def mySqrt(x: Int): Int = {
    @annotation.tailrec
    def mySqrt(guess: Int): Int =
      if (isGoodEnough(guess))
        guess
      else
        mySqrt(improve(guess))

    def isGoodEnough(guess: Long): Boolean =
      if (guess * guess <= x && (guess + 1) * (guess + 1) > x)
        true
      else false

    def improve(guess: Long): Int = ((guess + x / guess) / 2).toInt

    mySqrt(1)
  }
}