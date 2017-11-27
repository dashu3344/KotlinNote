package com.lxs.kotlin

/**
 *
 * Name: Test
 * Author: lxs
 * Email:
 * Comment: //TODO
 * Date: 2017-11-22 10:22
 *
 */
class Test {
    // 方法 返回值为Int类型


}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum_01(a: Int, b: Int) = a + b


/**
 *     函数返回无意义的值  Unit
 */
fun printSum(a: Int, b: Int): Unit {
//    println("sum of 19 and 23 is $ {sum(19,23)}")
    println("sum of $a and $b is ${a + b}")
}

// Unit 返回值类型可以省略
fun printSum01(a: Int, b: Int) {
    println("sum of $a and $b is${a + b}")
}

fun main(args: Array<String>) {
//    println(sum(2, 3))
//    println(printSum(19, 23))
    println(printSum01(20, 30))

    val a: Int
    a = 1
}

// 定义变量
val x = 1 //立即赋值
val b = 2 // 自动推断出 Int 类型
val e: Int = 2

