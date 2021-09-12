fun main() {
    var max = 0
    while (true) {
        val num = readLine()!!.toInt()
        if (num > max) {
            max = num
        }
        if (num == 0) break
    }
    println(max)
}