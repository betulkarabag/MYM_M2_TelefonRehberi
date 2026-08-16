package ders4

fun main() {
    val sinavNotlari = mutableMapOf<String, Int>()
    sinavNotlari["Matematik"] = 95
    sinavNotlari["Fizik"] = 85
    sinavNotlari["Kimya"] = 79
    sinavNotlari["Kimya"] = 90
    println(sinavNotlari)
    println(sinavNotlari["Matematik"])
    for ((key , value) in sinavNotlari) {
        println("Ders adı:$key ,sınav notu:$value")
    }
    val sehirPlakaları = mapOf(
        "İstanbul" to 34,
        "İzmir" to 35,
        "Zonguldak" to 67
    )
}