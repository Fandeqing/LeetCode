/**
  * Created by wqlin on 17-10-29 11:13.
  */
object No67 {
  def addBinary(a: String, b: String): String = {
    def addBinary(index1: Int, index2: Int, carry: Int, res: List[Char]): String =
      if (index1 >= 0 && index2 >= 0) {
        val nextCarry = carry + a(index1).toInt - '0' + b(index2).toInt - '0'
        addBinary(index1 - 1, index2 - 1, nextCarry / 2, (nextCarry % 2 + '0').toChar :: res)
      } else if (index1 >= 0) {
        val nextCarry = carry + a(index1).toInt - '0'
        addBinary(index1 - 1, index2 - 1, nextCarry / 2, (nextCarry % 2 + '0').toChar :: res)
      } else if (index2 >= 0) {
        val nextCarry = carry + b(index2).toInt - '0'
        addBinary(index1 - 1, index2 - 1, nextCarry / 2, (nextCarry % 2 + '0').toChar :: res)
      }
      else if (carry == 0) res.mkString("") else res.mkString("1", "", "")

    addBinary(a.length - 1, b.length - 1, 0, Nil)
  }
}
