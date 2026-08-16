package TelefonRehberiProjesi

fun main() {
val telefonRehberi = mutableMapOf<String, String>()
    while(true){
        menuyuGoster()
        val secim = readln()
        when (secim) {
            "1"->kisiEkle(telefonRehberi)
            "2"->kisiBul(telefonRehberi)
            "3"->rehberigoruntule(telefonRehberi)
            "4"-> {
                println("İyi günler dileriz.")
                break
            }else -> println("Geçersiz seçim 1 ve 4 arası bir rakam seçiniz.")

        }
    }

}
fun menuyuGoster(){
    println( """"
         TELEFON REHBERİ
      1-) Kişi ekle
      2-) Kişi bul
      3-) Rehberi görüntüle
      4-) Çıkış
   """.trimIndent()
    )
    println("Seçimiz: ")
}
fun isimFormatla(İsim:String):String {
    val formatlıİsim = İsim.trim().lowercase()
    return formatlıİsim
}
fun kisiEkle(rehber: MutableMap<String, String>) {
    println("Kişi adını giriniz: ")
    val kisiAdi = readln().trim()
    isimFormatla(kisiAdi)
    println("$kisiAdi'nin numarasını giriniz: ")
    val kisiNumara = readln().trim()
    if (kisiNumara.isEmpty() && kisiNumara.isEmpty()) {
        println("isim ve numara boş bırakılamaz")
    } else {
        if (rehber.containsKey(kisiAdi)) {
            println("Bu kişi zaten kayıtlı")
        } else{
            println("Rehbere eklendi")
        }
        rehber[kisiAdi] = kisiNumara
    }
}
fun kisiBul(rehber: Map<String, String>) {
        println("Kimi arıyorsunuz: ")
        var arananKisi = readln().trim()
        arananKisi = isimFormatla(arananKisi)
        if (arananKisi.isEmpty()) {
            println("HATA: arama kısmı boş bırakılamaz")
        } else {
            if (rehber.containsKey(arananKisi)) {
                val kisiNumara = rehber[arananKisi]
                println("Sonuç: $arananKisi: $kisiNumara")
            } else
                println("Aradığınız kişi bulunamadı.")
        }
    }
fun rehberigoruntule(rehber: Map<String, String>){
        if (rehber.isEmpty()) {
            println("Rehberiniz boş.")
        }else{
            println("KAYITLI KİŞİLER\n")
            for ((kisiAdi ,kisiNumara) in rehber){
                println("$kisiAdi:$kisiNumara")
            }
        }
    }

