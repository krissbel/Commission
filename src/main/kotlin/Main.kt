const val MIN_COMMISSION = 3500

fun main() {
    print("Введите сумму перевода: ")
    var transferAmount = (readLine()?.toDouble() ?: return) * 100
    val commission = transferAmount * 0.75 / 100
    val amount = if (commission > MIN_COMMISSION)
        transferAmount - commission
    else
        transferAmount - MIN_COMMISSION
    println("Зачисленная сумма: " + amount / 100 + " р.")
    if (commission > MIN_COMMISSION)
        println("Комиссия составила: " + commission / 100 + " р.")
    else
        println("Комиссия составила: " + MIN_COMMISSION / 100 + " р.")
}