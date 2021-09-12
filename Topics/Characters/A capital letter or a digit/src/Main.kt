fun main() {
    val a = readLine()!!.first()
    println(a.isUpperCase() || a.isDigit() && a != '0')
}