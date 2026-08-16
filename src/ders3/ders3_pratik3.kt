package ders3

fun main() {
    val sayilar = Array(5) {0}
    for (i in 0 until 5) {
        print("${i+1}. Sayıyı giriniz: ")
        val giris = readln().toInt()
        if (giris != null) {
            sayilar[i] = giris
        }else{
            println("Giriş yapılmadı.")
            return
        }

    }
    sayilar.sort()
    println("Sıralanmış dizi: ${sayilar.joinToString(" | ")}")
}