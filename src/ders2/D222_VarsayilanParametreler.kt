package ders2

import ders1.cizgiCek

fun main() {
    kahveSiparisiAl("Filtre kahve")
    kahveSiparisiAl("Türk kahvesi","Şekersiz")
    cizgiCek()
    kahveSiparisiAl("Latte", sut = true)

}
fun kahveSiparisiAl(kahveTuru:String , seker:String = "Orta şeker" , sut:Boolean = false){
    println("Kahve siparişiniz: $kahveTuru Şeker miktarı: $seker Sütlü mü: $sut")

}