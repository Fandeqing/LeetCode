/**
  * Created by wqlin on 17-10-25 13:17.
  */
object No50 {
  def myPow(x: Double, n: Int): Double = {
    def myPowInAbs(x: Double, n: Int): Double = {
      if (n == 0) 1.0
      else if (n == 1) x
      else if (n % 2 == 0)
        myPowInAbs(x * x, n / 2)
      else
        x * myPowInAbs(x * x, n / 2)
    }

    if (n < 0)
      1 / myPowInAbs(x, n.abs)
    else
      myPowInAbs(x, n)
  }
}
