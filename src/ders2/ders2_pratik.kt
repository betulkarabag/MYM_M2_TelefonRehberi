package ders2

fun main() {
    print("Lütfen ürünün fiyatını giriniz: ")
    val urunfiyati = readln().toDoubleOrNull() ?: 0.0
    val sonTUtar = sepetHesapla(urunfiyati)
    println("Ödeyeceğiniz tutar: $sonTUtar")
}
fun sepetHesapla(urunfiyati: Double , kdvOrani: Double = 0.18 , kargoUcreti: Double = 29.99):Double {
    val kdvlifiyat = urunfiyati * (1+kdvOrani)
    return kdvlifiyat + kargoUcreti
}