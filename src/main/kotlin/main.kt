fun main() {

    println("Bem vindo ao ByteBank!")

/*
      Você pode definir essa variável tanto como mutável (var) como imutável (val).
      Todas as variáveis precisam de um valor de inicialização para o programa rodar.
      Não é necessário declarar explicitamente o tipo da variável.
      O tipo da variavel não é modificada durante a execução do programa.
*/

    val titular: String = "Hugo"
    val numeroConta: Int = 1000
    var saldo = 0.0

    saldo = 100 + 2.0
    saldo += 200

//    String template
    println("Titular $titular")
    println("Numero conta $numeroConta")
    println("Saldo conta $saldo")

}