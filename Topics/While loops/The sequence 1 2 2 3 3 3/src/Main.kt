fun main() {
    val number = readLine()!!.toInt()
    var text = mutableListOf<Int>()
    var i = 1
    var z = 0
    while (i <= number) {
        for (element in 1..i) {
            if (text.size == number) {
                break
            }
            text += i
        }
        i++
    }
    for (x in text) {
        print(x)
        print(" ")
    }
}