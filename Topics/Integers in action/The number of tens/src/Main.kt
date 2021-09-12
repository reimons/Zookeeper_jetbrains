fun main() {
    val a = readLine()!!.toInt()
    val z = a / 100 
    val v = (a - z * 100) % 10
    val x = a - z * 100
    println((a - (z * 100) -v) / 10)
}
