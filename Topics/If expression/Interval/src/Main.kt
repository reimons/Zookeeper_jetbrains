fun main() {
    val a = readLine()!!.toInt()
    if (a > -15 && a <= 12 || a > 14 && a < 17 || a >= 19 && a < Integer.MAX_VALUE) {
        println("True")
    } else println("False")
}