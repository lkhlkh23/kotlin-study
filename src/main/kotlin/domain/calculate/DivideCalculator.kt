package domain.calculate

import java.lang.Exception

class DivideCalculator : Calculator {
  override fun calculate(num1: Int, num2: Int): Any {
    if (num2 == 0) {
      throw Exception("0으로 나눌 수 없겠죠?!")
    }

    return num1.toDouble() / num2
  }
}
