package ders1

fun main() {
    print("Lütfen isminizi girin: ")
    val isim = readlnOrNull() ?: "Değerli müşterimiz"
    telifHakkıKarti(isim)

}
fun telifHakkıKarti(kullaniciAdi: String){
    println("Sayın $kullaniciAdi, Hoşgeldiniz!")
}