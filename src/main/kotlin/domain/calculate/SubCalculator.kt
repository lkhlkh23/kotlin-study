package domain.calculate

class SubCalculator : Calculator {
  override fun calculate(num1: Int, num2: Int): Any {
    return num1 - num2
  }
}
