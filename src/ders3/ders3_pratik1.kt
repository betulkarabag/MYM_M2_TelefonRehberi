package ders3

fun main() {
    val sepet = mutableListOf<String>()
    sepeteurunekle(sepet)
    urunSorgula(sepet)

}
fun sepeteurunekle(sepet: MutableList<String>){
    for (i in 1..3){
        println("$i. ürünü giriniz: ")
        val urun = readln().trim()
        if (!urun.isNullOrEmpty())
            sepet.add(urun)
        else
            println("Geçerli bir ürün giriniz.")
    }
    println("Sepet: $sepet")
}
fun urunSorgula(sepet: MutableList<String>){
    print("Aramak istediğiniz ürünün adını giriniz: ")
    val arananUrun = readln().trim()
    if (arananUrun.isNullOrEmpty()) {
        println("Geçerli bir ürün girmediniz.")
        return
    }
    val index = sepet.indexOf(arananUrun)
    if(index != -1){
        println("Aradığınız ürün ${index+1}. sıradadır.")
    }else {
        println("Ürün listede bulunamadı.")
        sepet.add(0, arananUrun)
        println("Yeni sepet: $sepet")
    }
}




