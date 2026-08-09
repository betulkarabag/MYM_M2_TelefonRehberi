package ders2

fun main() {
    print("Lütfen ürünün fiyatını giriniz: ")
    val urunFiyati = readln().toDoubleOrNull() ?: 100.0
    print("Kuponunuz var mı (E/H):  ")
    val kupon = readln()?.trim()?.uppercase() == "E"
    val toplamTutar = if (kupon)
        sepethesapla(urunFiyati, kargoUcreti = 0.0)
    else{
        sepethesapla(urunFiyati)
    }
    println("Hesaplanan toplam tutar: $toplamTutar TL")




}
fun sepethesapla(urunFiyati: Double, kdvOrani : Double = 0.18, kargoUcreti: Double = 29.90):Double {
    return (urunFiyati * (1+ kdvOrani)) + kargoUcreti
}