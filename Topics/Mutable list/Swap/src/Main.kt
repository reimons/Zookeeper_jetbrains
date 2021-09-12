fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val a = numbers.first()
    val b = numbers.last()
    val z = numbers.size
    numbers[0] = b
    numbers[z - 1] = a
    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}