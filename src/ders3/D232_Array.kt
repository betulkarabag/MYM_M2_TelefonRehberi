package ders3

fun main() {
    val gunler = arrayOf("pazartesi","salı","çarşamba","perşembe","cuma")
    println(gunler[2])
    val isimler = arrayOfNulls<String>(5)
    println(isimler.contentToString())
    val sayilar = IntArray(5)
    println(sayilar.contentToString())
    val ondaliklisayilar = DoubleArray(5)
    println(ondaliklisayilar.contentToString())
    println(gunler.joinToString(" | "))
    for (gun in gunler) {
        println(gun.uppercase())
    }
}