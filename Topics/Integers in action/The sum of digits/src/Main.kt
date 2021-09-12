fun main() {
    val a = readLine()!!.toInt()
    val x = a / 100 % 10
    val z = a / 10 % 10
    val c = a - (x * 100 + z * 10)
    println(x + z + c)
}
