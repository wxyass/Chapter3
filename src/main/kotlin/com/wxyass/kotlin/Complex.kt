package com.wxyass.kotlin

/**
 * Created by benny on 3/19/17.
 */
class Complex(var real: Double, var imaginary: Double){
    operator fun plus(other: Complex): Complex{
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex{
        return Complex(real + other, imaginary)
    }

    operator fun plus(other: Any): Int{
        return real.toInt()
    }

    operator fun invoke(): Double{
        return Math.hypot(real, imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

class Book{
     infix fun on(any: Any): Boolean{
        return false
    }
}

class Desk

fun main(args: Array<String>) {

    val c1 = Complex(3.0,4.0) // 3 + 4I
    val c2 = Complex(2.0,7.5) // 2 + 7.5i
    println(c1+c2) // 5 + 11.5i
    println(c1+5) // 8 + 4I
    println(c1+"HelloWorld") // 3


    //-name <Name>
    if("-name" in args){
        println(args[args.indexOf("-name") + 1])
    }

    if(Book() on Desk()){ // dsl

    }
}