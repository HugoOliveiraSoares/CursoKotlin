fun main() {

    val contaHugo = Conta()
    contaHugo.titular = "Hugo"
    contaHugo.numeroConta = 1000
    contaHugo.setSaldo(250.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 1001
    contaFran.setSaldo(250.0)

    println(contaHugo.titular)
    println(contaHugo.numeroConta)
    println(contaHugo.getSaldo())
    println()
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.getSaldo())

    println("depositando na conta do Hugo")
    contaHugo.deposita(50.0)
    println(contaHugo.getSaldo())
    println("depositando na conta da Fran")
    contaFran.deposita(50.0)
    println(contaFran.getSaldo())

    println("Sacando na conta do Hugo")
    contaHugo.saca(300.0)
    println(contaHugo.getSaldo())
    println("Sacando na conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.getSaldo())

    println("Tranferencia")

    if (contaFran.tranfere(100.0, contaHugo))
        println("Sucesso")
    else
        println("FALHA")

    println(contaHugo.getSaldo())
    println(contaFran.getSaldo())

}
