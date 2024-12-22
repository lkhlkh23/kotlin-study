package domain.calculate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class DivideCalculatorTest {

  @Test
  @DisplayName("0 으로 나눌 경우, 예외 발생")
  fun test_calculate_1() {
    assertThrows<Exception> {
      DivideCalculator().calculate(6, 0)
    }
  }

  @Test
  @DisplayName("0 이 아닌 수로 나눌 경우, 정상 결과 응답")
  fun test_calculate_2() {
    assertThat(DivideCalculator().calculate(6, 2)).isEqualTo(3.0)
  }
}
