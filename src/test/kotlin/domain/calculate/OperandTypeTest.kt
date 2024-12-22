package domain.calculate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class OperandTypeTest {

  @Test
  @DisplayName("존재하는 연산자일 경우, 연산할 수 있는 객체 리턴")
  fun test_getCalculator_1() {
    assertThat(OperandType.getCalculator('+')).isInstanceOf(SumCalculator::class.java)
  }

  @Test
  @DisplayName("존재하지 않는 연산자일 경우, 예외 발생")
  fun test_getCalculator_2() {
    assertThrows<Exception> {
      OperandType.getCalculator('$')
    }
  }
}
