package com.maytemur.oopkotlin

class Kullanici : insan {
    var isim : String? = null
    var yas : Int? = null

        constructor(isim: String, yas : Int){
            this.isim = isim
            this.yas = yas
            println("constructor çağrıldı")
        }
        init {
            println("init çağrıldı")
        }
}
/*class Kullanici (isim : String,yas : Int) : insan() {

        init {
            println("init çağtıldı primary constructor")
        }


}*/