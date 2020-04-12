fun main() {
    val (a, b) = readLine()!!.split(" ").map(String::toInt)
    println(calc(a, b))
}

fun calc(a: Int, b: Int): String {
    return if (a * b % 2 == 0)
        "Even"
    else
        "Odd"
}