package domain.calculate

enum class OperandType(val type: Char, val calculator: Calculator) {
  SUM('+', SumCalculator()),
  SUB('-', SubCalculator()),
  MULTIPLY('*', MultiplyCalculator()),
  DIVIDE('/', DivideCalculator());

  companion object {
    @JvmStatic
    fun getCalculator(type: Char): Calculator {
      return entries.find { it.type == type }?.calculator ?: throw IllegalArgumentException(
        "Invalid Operand Type: $type"
      )
    }
  }
}
