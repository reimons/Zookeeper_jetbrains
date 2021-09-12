import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var z = 0
    var max = 0
    var printS = 0
    while (scanner.hasNext()) {
        val next = scanner.next().toInt()

        if (next > 0) {
            ++max
        } else {
            printS = max
            max = 0
        }
        if (z == 1) {
            break
        }
        if (next == 0) {
            z = 1
        }

    }
    println(printS)
}
