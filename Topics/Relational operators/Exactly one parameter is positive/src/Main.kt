fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val result = a > 0 && b <= 0 && c <= 0 || a <= 0 && b > 0 && c <= 0 || a <= 0 && b <= 0 && c > 0
    println(result)
}
