fun main() {
    val numbers = (0..99).toMutableList()
    for (i in 0..99) {
        numbers[i] = 0
    }
    numbers[0] = 1
    numbers[9] = 10
    numbers[99] = 100
    println(numbers.joinToString())
}
