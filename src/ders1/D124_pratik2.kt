package ders1

fun main() {
    print("Kaç kilometre yol aldınız:")
    val km = readln().toDoubleOrNull() ?: 0.0
    val mil = kmDenMile(km)
    println("$mil mil yol almışsınız.")

}
fun kmDenMile(km:Double):Double{
    return km * 0.62

}