package domain.calculate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class CalculatorBoardTest {

  @Test
  @DisplayName("존재하는 연산자로 계산할 경우, 정상적인 결과 리턴")
  fun test_calculate_1() {
    assertThat(CalculatorBoard.calculate(3, 4, '*')).isEqualTo(12)
  }

  @Test
  @DisplayName("존재하지 않는 연산자로 계산할 경우, 예외 발생")
  fun test_calculate_2() {
    assertThrows<Exception> {
      CalculatorBoard.calculate(3, 4, '$')
    }
  }

  @Test
  @DisplayName("0으로 나눌 때, 예외 발생")
  fun test_calculate_3() {
    assertThrows<Exception> {
      CalculatorBoard.calculate(6, 0, '/')
    }
  }
}
