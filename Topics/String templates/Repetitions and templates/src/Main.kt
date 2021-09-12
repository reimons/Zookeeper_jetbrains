fun main() {
    val a = readLine()!!.toString()
    print("${a.length} repetitions of the word $a: ")
    repeat(a.length) { print(a) }
}