package ders2

fun main() {
    print("Dairenizin yarıçapını giriniz (Tam Sayı): ")
    val yarıcap = readln().toIntOrNull() ?: 0
    val alan = daireninAlani(yarıcap)
    println("Yarıçapı $yarıcap olan dairenin alanı: $alan")

}
fun daireninAlani(r: Int):Double = 3.14*r*r