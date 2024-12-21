package practice

class LoopConditionPractice {

  companion object {

    @JvmStatic
    fun loop(args: Array<String>) {
      for (arg in args) {
        println("arguments : $arg")
        if (arg.equals("pause")) {
          break
        }
      }
    }

    @JvmStatic
    fun condition(num1: Int, num2: Int = 999) {
      if (num1 > num2) {
        println("num1 ($num1) is greater than num2 ($num2)")
      }

      when (num1) {
        1, 2 -> println("1")
        in 3..10 -> println("3 to 10")
        else -> println("else")
      }
    }
  }
}
