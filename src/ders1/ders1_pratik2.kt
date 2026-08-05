package ders1

fun main() {
    print("İsminiz: ")
    val isimGirdisi = readln()
    print("Puanınızı giriniz: ")
    val puanGirdisi = readln().toIntOrNull() ?: 0
    yazdirSkorKarti(isimGirdisi, puanGirdisi)

}
fun yazdirSkorKarti(oyuncuAdi:String , oyuncuPuani: Int){
    println("""
        ***********************
               SKOR TABLOSU
           oyuncu: $oyuncuAdi
           puanı: $oyuncuPuani
        ************************   
       """.trimIndent())
}