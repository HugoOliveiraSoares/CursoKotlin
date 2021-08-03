fun main() {

    val contaHugo = Conta()
    contaHugo.titular = "Hugo"
    contaHugo.numeroConta = 1000
    contaHugo.saldo = 2500.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 1001
    contaFran.saldo = 2300.0

    println(contaHugo.titular)
    println(contaHugo.numeroConta)
    println(contaHugo.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("depositando na conta do Hugo")
    deposita(contaHugo, 50.0)
    println(contaHugo.saldo)
    println("depositando na conta da Fran")
    deposita(contaFran, 50.0)
    println(contaFran.saldo)

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}
