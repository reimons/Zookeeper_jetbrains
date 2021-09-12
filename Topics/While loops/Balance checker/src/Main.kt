import kotlin.math.abs

fun main() {
    var totalMoney = readLine()!!.toInt()
    val payList = readLine()!!.split(" ").toList()
    for (element in payList) {
        val cost = element.toInt()
        if (cost > totalMoney) {
            println("Error, insufficient funds for the purchase. You have $totalMoney, but you need $cost.")
            return
        }
        totalMoney -= cost
    }
    println("Thank you for choosing us to manage your account! You have $totalMoney money.")
}
