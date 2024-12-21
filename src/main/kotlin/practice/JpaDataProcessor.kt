package practice

class JpaDataProcessor : DataProcessor {

  override fun fetch(): String {
    println("JpaDataProcessor fetch")
    return "JpaDataProcessor"
  }

  override fun register(data: String) {
    println("JpaDataReader register : $data")
  }
}
