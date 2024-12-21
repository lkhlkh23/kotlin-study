package practice

class Student constructor(val name: String, val age: Int) : Person(name, age) {

  override fun printInfo() {
    println("name : $name, age : $age")
  }
}
