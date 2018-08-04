package com.wxyass.kotlin

/**
 * Created by benny on 3/19/17.
 */
fun main(vararg args: String) {
//    for (arg in args){
//        println(arg)
//    }

    val list = arrayListOf(1,3,4,5)
    val array = intArrayOf(1,3,4,5)
    hello(3.0, *array)

    hellc(1.2,2,3,4,string = "Hellc")
}

// 在Kotlin中变长参数可以在任意位置,而不是只能放在最后一个参数
fun hellc(double: Double,vararg ints: Int, string: String ){
    println(double)
    ints.forEach(::println)
    println(string)
}

fun hello(double: Double, vararg ints: Int, string: String = "Hello"){
    println(double)
    ints.forEach(::println)
    println(string)
}