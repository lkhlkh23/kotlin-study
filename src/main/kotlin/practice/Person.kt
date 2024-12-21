package practice

open class Person constructor(private val name: String, private var age: Int) {

  private var gender: Char = 'M'

  init {
    println("Always Called")
  }

  constructor(name: String) : this(name, 35)

  constructor(name: String, age: Int, gender: Char) : this(name, age) {
    this.gender = gender
    println("gender is $gender")
  }

  open fun printInfo() {
    println("name : $name")
  }
}
