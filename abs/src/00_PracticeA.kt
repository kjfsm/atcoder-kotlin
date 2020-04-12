fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b, c) = readLine()!!.split(' ').map(String::toInt)
    val s = readLine()!!
    println(calc(a, b, c, s))
}

fun calc(a: Int, b: Int, c: Int, s: String): String {
    return (a + b + c).toString() + " " + s
}
