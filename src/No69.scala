/**
  * Created by wqlin on 17-10-28 11:38.
  */
object No69 {
  def mySqrt(x: Int): Int = {
    def mySqrt(guess: Int, x: Int): Int =
      if (isGoodEnough(guess, x))
        guess
      else
        mySqrt(improve(guess, x), x)

    def isGoodEnough(guess: Long, x: Long): Boolean =
      if (guess * guess <= x && (guess + 1) * (guess + 1) > x)
        true
      else false

    def improve(guess: Long, x: Long): Int = ((guess + x / guess) / 2).toInt

    mySqrt(1, x)
  }
}