package com.example.firsthomework

import kotlin.random.Random

fun main() {

    val rastgeleSayi = Random.nextInt(0, 101) //0-100 rastgele sayi

    var attempts = 0

    //0-100 rastgele sayi

    println("0 ile 101 arasında bir sayı tutunuz.")
    println("3 tahmin hakkınız vardır!")

    for (attempt in 1..3){
        println("Hak $attempt : Tahmininizi giriniz:")
        val tahmin = readLine()?.toIntOrNull()

        if(tahmin != null){
            attempts++

            when {
                tahmin < rastgeleSayi -> println("Daha büyük bir sayı deneyin.")
                tahmin > rastgeleSayi -> println("Daha küçük bir sayı deneyin.")
                else -> {
                    println("Tebrikler, doğru tahmin!")
                    println("Toplam hak: $attempt")
                    return
                }
            }

          }
        }
    println("Üzgünüm, hakkınız bitti:(")

}
