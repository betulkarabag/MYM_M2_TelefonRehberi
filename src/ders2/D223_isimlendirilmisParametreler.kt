package ders2

fun main() {
    profilOlustur("Betül" ,"Karabağ" , bultenAboneligi = true)
    profilOlustur(
        ad = "Betül",
        soyad = "Karabağ",
        bultenAboneligi = true ,
        yas = 20
    )

}
fun profilOlustur(ad: String , soyad: String , yas: Int = 18 , bultenAboneligi:Boolean = false) {
    println("Kullanıcı: $ad $soyad, Yaş: $yas, Bülten: $bultenAboneligi")
}
