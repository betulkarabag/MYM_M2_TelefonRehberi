package ders2

fun main() {
    urunKaydet(fiyat = 150.0 , id = 11 , isim = "Kalem")

}
fun urunKaydet(id: Int ,kategori:String = "Genel" ,isim: String ,fiyat: Double){
    println("Ürün bilgisi \n $id \n $kategori \n $isim \n $fiyat")
}