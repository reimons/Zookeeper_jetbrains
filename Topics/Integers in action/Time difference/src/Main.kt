fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    val e = readLine()!!.toInt()
    val f = readLine()!!.toInt()
    val h = d * 60 * 60 + e * 60 + f
    val g = a * 60 * 60 + b * 60 + c
    println(h - g)
}
