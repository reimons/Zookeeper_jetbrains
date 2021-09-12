fun main() {
    val n = readLine()!!.toInt()
    var x = 1
    var squareValue = 0

    while (squareValue < n) {
        squareValue = x * x
        x++;
        if (squareValue <= n) {
            println(squareValue)
        }
    }
}
