package com.wxyass.kotlin

/**
 * Created by benny on 3/9/17.
 */



class A{

    // 定义成员变量
    var b = 0
        get() {return field}
        set(value) {field = value}

    // var 使用lateinit修饰
    lateinit var c: String
    lateinit var d: X

    // val 使用lazy来延时初始化
    val e: X by lazy {
        println("init X")
        X()
    }

    // 不推荐这样初始化
    var cc: String? = null
}

class X

fun main(args: Array<String>) {

    println("start")
    val a = A()
    println("init a")

    println(a.b) // 打印0
    println(a.e) // 不报错

    a.d = X()  // 对于lateinit修饰的变量,使用前必须初始化
    println(a.d) // 不报错

    println(a.c) // 这行会报错,因为对于c没有初始化,就使用了

    println(a.cc?.length)
}