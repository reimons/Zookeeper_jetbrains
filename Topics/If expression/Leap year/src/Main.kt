fun main() {
    val a = readLine()!!.toInt()
    if (a in 1900..3000) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            println("Leap")
        } else println("Regular")
    }
}
