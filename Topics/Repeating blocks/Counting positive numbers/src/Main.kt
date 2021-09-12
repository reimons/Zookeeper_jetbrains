fun main() {
    val n = readLine()!!.toInt()
    var sumPositiveNum = 0

    repeat(n) {
        val x = readLine()!!.toInt()
        if (x > 0) {
            ++sumPositiveNum
        }
    }
    println(sumPositiveNum)
}
