fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    when (a > b) {
        true -> println(a)
        false -> println(b)
    }
}