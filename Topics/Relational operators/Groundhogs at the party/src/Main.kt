fun main() {
    val x = readLine()!!.toInt()
    val z = readLine()!!.toBoolean()
    println(!z && x in 10..20 || z && x in 15..25)
}
