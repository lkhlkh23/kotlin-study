package practice

enum class SignalType constructor(val code: String, val description: String) {
  GREEN("01", "합격"),
  RED("02", "불합격"),
  YELLOW("03", "보류");
}
