package ders4

fun main() {
    val cekilisKatilimcilari = mutableSetOf<String>()
    cekilisKatilimcilari.add("Betül")
    cekilisKatilimcilari.add("Kerem")
    cekilisKatilimcilari.add("Betül")
    cekilisKatilimcilari.add("Betül")
    println(cekilisKatilimcilari)
    val katılımcıListesi = cekilisKatilimcilari.toList()
    println("Listenin ilk elemanı ${katılımcıListesi[0]}")
    val ogrenciListesi = mutableListOf<String>()
    ogrenciListesi.add("Kerem")
    ogrenciListesi.add("Kerem")
    println(ogrenciListesi)
    val setOgrenci = ogrenciListesi.toSet()
    println(setOgrenci)
}