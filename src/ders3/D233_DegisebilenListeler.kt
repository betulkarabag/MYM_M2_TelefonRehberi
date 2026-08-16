package ders3

fun main() {
    val alısverisSepeti = mutableListOf<String>("Kalem")
    alısverisSepeti.add("Silgi")
    alısverisSepeti.add("Defter")
    println("Alışveriş sepeti $alısverisSepeti")
    alısverisSepeti.add(1,"Çanta")
    println("Alışveriş sepeti $alısverisSepeti")
    alısverisSepeti.remove("Defter")
    println("Alışveriş sepeti $alısverisSepeti")
    alısverisSepeti.removeAt(2)
    println("Alışveriş sepeti $alısverisSepeti")
    alısverisSepeti.clear()
    println("Alışveriş sepeti $alısverisSepeti")


}