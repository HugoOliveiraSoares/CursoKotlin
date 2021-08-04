fun testaComportamentosConta() {
    val contaHugo = Conta("Hugo", 1000)
    contaHugo.deposita(2500.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(2300.0)

    println(contaHugo.titular)
    println(contaHugo.numeroConta)
    println(contaHugo.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)
}