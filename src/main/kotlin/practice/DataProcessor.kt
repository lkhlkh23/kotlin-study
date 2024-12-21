package practice

interface DataProcessor {
  fun fetch(): String {
    println("DataReader fetch")
    return "DataProcessor"
  }

  fun register(data: String)
}
