package domain.calculate

class CalculatorBoard {
  companion object {
    @JvmStatic
    fun calculate(num1: Int, num2: Int, operand: Char): Any {
      return OperandType.getCalculator(operand).calculate(num1, num2)
    }
  }
}
