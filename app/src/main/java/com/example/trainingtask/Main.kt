package com.example.trainingtask
fun main() {
    task8()
    task14()
    task16()
    task22()
    task26()
}
fun task8() {
    print("Enter day number (1-7): ")
    val day = readln().toInt()
    val name = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Wrong number"
    }
    println("Day: $name")}

fun task14() {
    for (i in 1..100) if (i % 3 == 0) print("$i ")
    println()
}

fun task16() { print("Enter coma separated array ")
    val nums = readln().split(",").map { it.toInt() }.toTypedArray()
    println("Reversed: ${nums.reversed().joinToString()}")
}

fun task22() {
     println("Enter your name (or leave empty):")
    val name: String? = readLine()
    println("Hello, ${name?.takeIf { it.isNotEmpty() } ?: "Anonymous"}")}

fun task26() {
    println("Enter dividend:")
    val numerator = readLine()?.toIntOrNull() ?: 0
    println("Enter divisor:")
    val denominator = readLine()?.toIntOrNull() ?: 1

    try {
    val result = numerator / denominator
    println("Result: $result")
    } catch (e: ArithmeticException) {
    println("Cannot divide by zero")
}}