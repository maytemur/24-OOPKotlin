package com.maytemur.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("OOP merdiveni sırasıyla Object,Class,Inheritance,Polymorphism,Abstraction,Encapsulation")
        println("--------------Sınıflar--------------")
            val kullaniciMustafa = Kullanici("Mustafa",48)
            val ikinciKullanici = Kullanici("Yabancı",34)
        println("--------------Encapsulation/Private/Public----------")
        val Ahmet = Sanatci("Ahmet",32,"Müsizyen","balık tutmak")
        println(Ahmet.isim)
        //Ahmet.isim = "Ahmet2"
        println(Ahmet.isim)
        println("--------------Inheritance/SınıfdanMirasAlma----------")
        val Mehmet = OzelSanatci("Mehmet",24,"Tiyatrocu","yüzmek")
        Mehmet.sarkisoyle()
        println("--------------Polymorphism----------")
        // Statik polymorphism
        val islem = islemler()
        println(islem.carpma())
        println(islem.carpma(2,5))
        println(islem.carpma(2,6,5))
        //Dinamik polymorphism
        val kedi = hayvan()
        kedi.sesCikar()
        val findik = kopek()
        findik.sesCikar()
        findik.kopekFonksiyonu()
        println("--------------Abstraction/Interface----------")
        kullaniciMustafa.insanFonksiyonu()
        var gitarM = Gitar()
        gitarM.marka ="Gitarimın Markası tako"
        gitarM.elektro = false
        gitarM.bilgi()
        println(gitarM.oda)
        println("--------------Lambda Gösterimi/Expressions----------")
        yazdigimiYazdir("test")
        val yazdigimiYazdirLambda = {verilenString:String -> println(verilenString)}
        yazdigimiYazdirLambda("test lambda")
        val carpmaIslemiLambda = {a:Int,b:Int -> a*b}
        println(carpmaIslemiLambda(6,8))
        val carpmaIslemiLambdaV2 : (Int,Int) -> Int = {a,b ->a*b}
        println(carpmaIslemiLambdaV2(4,6))

    }
    fun yazdigimiYazdir (string : String){
        println(string)
    }
}