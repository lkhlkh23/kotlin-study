package domain.calculate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class SubCalculatorTest {

  @Test
  @DisplayName("정상 결과 응답")
  fun test_calculate_1() {
    assertThat(SubCalculator().calculate(6, 2)).isEqualTo(4)
  }

}
