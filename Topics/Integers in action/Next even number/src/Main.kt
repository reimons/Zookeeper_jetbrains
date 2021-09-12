fun main() {
    var a = readLine()!!.toInt()
    if(a % 2 == 0){
        a += 2
    }else ++a
    println(a)
}