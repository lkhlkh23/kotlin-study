package domain.calculate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class MultiplyCalculatorTest {

  @Test
  @DisplayName("정상 결과 응답")
  fun test_calculate_1() {
    assertThat(MultiplyCalculator().calculate(6, 2)).isEqualTo(12)
  }

}
