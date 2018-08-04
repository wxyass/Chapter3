package com.wxyass.kotlin

/**
 * Created by benny on 3/5/17.
 */
const val FINAL_HELLO_WORLD: String = "HelloWorld"
var helloWorld: String = FINAL_HELLO_WORLD

val FINAL_HELLO_CHINA = "HelloChina"

fun main(args: Array<String>) { // (Array<String>) -> Unit
//    checkArgs(args)
//    val arg1 = args[0].toInt()
//    val arg2 = args[1].toInt()
//    println("$arg1 + $arg2 = ${sum(arg1, arg2)}")
//    println(int2Long(3))
//    println(sum(1, 3))
//    println(sum.invoke(1, 3))

//    args.forEach ForEach@{
//        if(it == "q") return@ForEach
//        println(it)
//    }
//
//    println("The End")

    println(sum1(2,3))// 5
    println(sum2(3,5))// 8
    println(sum3(4,5))// 9
    println(sum(5,5))// 10
    println(sum.invoke(5,5))// 10
    println(int2Long(6)) // 6
    println(sum)// 打印方法 返回lambda类型  Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
    println(int2Long)// Function1<java.lang.Integer, java.lang.Long>
    println(::printUsage is ()-> Unit) // true
}

fun checkArgs(args: Array<String>) {
    if (args.size != 2) {
        printUsage()
        System.exit(-1)// 0xFF
    }
}

fun printUsage() {
    println("请传入两个整型参数，例如 1 2") // (Any?) -> Unit
} // ()->Unit


fun sum1(arg1: Int, arg2: Int):Int{
    return arg1 + arg2
}

fun sum2(arg1: Int, arg2: Int) = arg1 + arg2

val sum3 = { arg1:Int,arg2:Int -> arg1 + arg2}

val sum = { arg1: Int, arg2: Int ->
    println("$arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2
}
// (Int, Int) -> Int

val printlnHello = {
    println("Hello")
}
// ()-> Unit

val int2Long = fun(x: Int): Long {
    return x.toLong()
}

//Int Long String  ABC

// (Int) -> Long


