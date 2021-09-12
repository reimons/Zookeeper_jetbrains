fun main() {
    val n = readLine()!!.toInt()
    var maxNumber = 0
    var sum = 0
    repeat(n) {
        var x = readLine()!!.toInt()
        if (x % 4 == 0) {
            if (x > maxNumber) {
                maxNumber = x
            }
        }
        sum += x
    }
    println(maxNumber)
}