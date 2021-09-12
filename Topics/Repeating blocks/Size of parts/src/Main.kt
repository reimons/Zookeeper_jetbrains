fun main() {
    val n = readLine()!!.toInt()
    var sumLarger = 0
    var sumSmaller = 0
    var sumPerfect = 0

    repeat(n) {
        val x = readLine()!!.toInt()
        if (x == 0) {
            ++sumPerfect
        }
        if (x < 0) {
            ++sumSmaller
        }
        if (x > 0) {
            ++sumLarger
        }
    }
    println("$sumPerfect $sumLarger $sumSmaller")
}
