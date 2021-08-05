import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun main() {

    println("Bem vindo ao ByteBank!")

    val hugo = Cliente("Hugo", "111.111.11-11", 1)
    val fran = Cliente("Fran", "222.222.22-22", 2)

    val contaHugo = ContaCorrente(hugo, 1000)
    contaHugo.deposita(250.0)

    val contaFran = ContaCorrente(fran, 1001)
    contaFran.deposita(250.0)

    println("nome ${contaHugo.titular.nome}")
    println("nome ${contaHugo.titular.cpf}")

}












