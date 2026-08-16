package ders3

fun main() {
    val katilimcilar = mutableListOf<String>()
    for (i in 1..4) {
        print("Katılımcı ismi: ")
        val isim = readln().trim()
        katilimcilar.add(isim)
    }
    katilimcilar.shuffle()
    val kazanan = katilimcilar.random()
    println("Toplam katılımcı: ${katilimcilar.size}")
    println("Kazanan kişi: $kazanan")
}