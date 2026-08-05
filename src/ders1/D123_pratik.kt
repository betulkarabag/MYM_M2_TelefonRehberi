package ders1

fun main() {
    urunFiyatıGoster(urunAdi = "kalem", fiyat = 25.90)
    cizgiCek()
    urunFiyatıGoster(urunAdi = "Çanta", fiyat = 549.99)
    cizgiCek()

}
fun urunFiyatıGoster(urunAdi:String, fiyat:Double){
    println("Ürün adı: $urunAdi Fiyatı: $fiyat TL")

}