fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf(0, 0, 0, 0)
    repeat(n) {
        when (readLine()!!.toInt()) {
            2 -> ++list[0]
            3 -> ++list[1]
            4 -> ++list[2]
            5 -> ++list[3]
        }
    }
    println("${list[0]} ${list[1]} ${list[2]} ${list[3]}")
}