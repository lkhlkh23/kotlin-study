package practice

class VariablePractice {
  companion object {
    @JvmStatic
    fun practice() {
      val name: String = "String"

      val isActive = true
      //  isActive = false;

      var cost: Int = 1_234
      cost *= cost
      cost++

      var op1 = 12
      var op2: Int = 10 + 2
      val isSame = op1 === op2

      println("op1 === op2 : $isSame")
      println("cost : $cost")
    }
  }
}
