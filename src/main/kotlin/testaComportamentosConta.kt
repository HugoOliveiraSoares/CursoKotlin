fun testaComportamentosConta() {

    val contaHugo = Conta("Hugo", 1000)
    contaHugo.deposita(250.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(250.0)

    println(contaHugo.titular)
    println(contaHugo.numeroConta)
    println(contaHugo.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)

    println("depositando na conta do Hugo")
    contaHugo.deposita(50.0)
    println(contaHugo.saldo)
    println("depositando na conta da Fran")
    contaFran.deposita(50.0)
    println(contaFran.saldo)

    println("Sacando na conta do Hugo")
    contaHugo.saca(300.0)
    println(contaHugo.saldo)
    println("Sacando na conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.saldo)

    println("Tranferencia")

    if (contaFran.tranfere(100.0, contaHugo))
        println("Sucesso")
    else
        println("FALHA")

    println(contaHugo.saldo)
    println(contaFran.saldo)

    println("TESTE")
    println(contaHugo.saldo)
}