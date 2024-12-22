package domain.vehicle

class Vehicle constructor(val provider: ProviderCode, val name: String, val efficiency: Double, val price: Long) {

  fun getMovableDistance(fuel: Int): Double {
    return fuel * efficiency
  }

  fun compare(target: Vehicle) {
    // 연비 비교 (target 에 대한 null 체크)
    println("")

    // 가격 비교
  }
}
