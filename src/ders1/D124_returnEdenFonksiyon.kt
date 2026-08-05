package ders1

fun main() {
    print("Doğum yılınızı giriniz: ")
    val dogumYili = readln().toInt()
    val yas =yasHesapla(dogumYili)
    println("Yaşınız: $yas")
    if (yas>=18)
        println("Ehliyet alabilirsin.")
    else
        println("Ehliyet alamazsın.")

}
fun yasHesapla(dogumYili: Int): Int{
    return  2026-dogumYili

}