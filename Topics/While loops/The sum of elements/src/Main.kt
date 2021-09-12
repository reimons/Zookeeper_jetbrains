import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    while (true) {
        val n = readLine()!!.toInt()
        if (n != 0) {
            sum += n
        } else break
    }
    println(sum)
}