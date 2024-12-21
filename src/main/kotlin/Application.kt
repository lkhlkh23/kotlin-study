import domain.calculate.CalculatorBoard
import practice.LoopConditionPractice
import practice.Person
import practice.VariablePractice

fun main(args: Array<String>) {
  println("Hello World!")

  // Try adding program arguments via Run/Debug configuration.
  // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
  println("Program arguments: ${args.joinToString()}")
  VariablePractice.practice()
  LoopConditionPractice.condition(4)

  // 매개변수를 직접 명시해서 가독성 향상!
  //  -> 개인적으로 파라미터의 갯수를 최대 3개를 지향하기 때문에 굳이 필요할까?!
  //  -> 변수명이 명시적이라면, 굳이 필요할까?!
  LoopConditionPractice.condition(num2 = 10, num1 = 22)

  val man = Person("LEE", 34)
  // man.age = 35;

  val result = CalculatorBoard.calculate(4, 2, '*')
  println("Result : $result")
}
