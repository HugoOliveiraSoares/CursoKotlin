fun main() {

    println("Bem vindo ao ByteBank!")

/*
      Você pode definir essa variável tanto como mutável (var) como imutável (val).
      Todas as variáveis precisam de um valor de inicialização para o programa rodar.
      Não é necessário declarar explicitamente o tipo da variável.
      O tipo da variavel não é modificada durante a execução do programa.
*/

    /*
        //cria 5 contas
        for (i in 1..5) {
          //...
        }

        //cria 5 contas na ordem decrescente
        for (i in 5 downTo 1) {
          //...
        }
        //cria 3 contas de 2 em 2
        for (i in 1..5 step 2) {
          //...
        }

        //cria apenas 4 contas do 1 até 4
        for (i in 1 until 5) {
          //...
        }

            loop@ for (i in 1..100){
            println("i $i")
            for (j in 1..100){
                println("j $j")
                if (j == 5)
                    break@loop
            }
        }

     */

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

}

class Conta {

    var titular = ""
    var numeroConta = 0
    var saldo = 0.0

}

fun testaLacos(){

    var i = 0
    while (i < 5) {
        val titular: String = "Hugo $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i

//    String template
        println("Titular $titular")
        println("Numero conta $numeroConta")
        println("Saldo conta $saldo")
        println("=====================")
        i++
    }

    for (i in 5 downTo 1) {

        if (i == 4)
            continue

        val titular: String = "Hugo $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i

//    String template
        println("Titular $titular")
        println("Numero conta $numeroConta")
        println("Saldo conta $saldo")
        println("=====================")
    }
}

fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}