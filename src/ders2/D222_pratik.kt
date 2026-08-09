package ders2

fun main() {
    uygulamayaGiris("Betül","Iphone")

}
fun uygulamayaGiris(kullanıcıAdi:String , CihazTipi: String = "Mobil") {
    println("Hoşgeldin $kullanıcıAdi (Cihaza $CihazTipi üzerinden bağlanıldı.)")

}