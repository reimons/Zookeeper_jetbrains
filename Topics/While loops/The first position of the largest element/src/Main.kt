import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var list = mutableListOf<Int>()
    while (scanner.hasNext()) {
        val next = scanner.next()
        list.add(next.toInt())
    }
    val max = list.maxOrNull() ?: 0
    var index = 0
    for (element in list) {
        index++
        if (element == max) {
            break
        }
    }
    println("$max $index")
}