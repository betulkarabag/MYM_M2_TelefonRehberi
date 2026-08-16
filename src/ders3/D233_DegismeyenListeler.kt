package ders3

fun main() {
    val zorlukSeviyesi = listOf<String>("Kolay","Orta","Zor")
    println(zorlukSeviyesi[0].uppercase())
    println(zorlukSeviyesi)
    // String yazmama gerek yok ama eğer tırnak içine bir şey yazmayacaksam değer yazmak zorundayım
    // List off'da değer değiştirelemez
    println(zorlukSeviyesi.size)
    println(zorlukSeviyesi.isEmpty())
}