import kotlin.math.abs

fun main() {
    val x = readLine()!!.toString().split("").toList()
    val y = readLine()!!.toString().split("").toList()
    val xz = x[0].toInt()==x[1].toInt()
    val yz= y[0].toInt()==y[1].toInt()

    var canAttacks = false

    if(xz||yz){
        canAttacks =true
    }else{
        canAttacks = abs(x[0].toInt() - x[1].toInt()) == abs(y[0].toInt()-y[1].toInt())
    }
    when(canAttacks){
        true-> println("Yes")
        false-> println("NO")
    }
}
