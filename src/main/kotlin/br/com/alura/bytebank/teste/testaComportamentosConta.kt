import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {

    val hugo = Cliente(
        "Hugo",
        "111.111.11-11",
        endereco = Endereco(
            "Rua Taquaril",
            872,
            "Jonas Veiga",
            "BH",
            "MG",
            "11111111"
        ),
        senha = 1
    )
    val fran = Cliente(
        "Fran",
        "222.222.22-22",
        senha = 2
    )

    val contaHugo = ContaCorrente(hugo, 1000)
    contaHugo.deposita(250.0)

    val contaFran = ContaCorrente(fran, 1001)
    contaFran.deposita(250.0)

    println("nome ${contaHugo.titular}")
    println("nome ${contaHugo.titular.nome}")
    println("nome ${contaHugo.titular.cpf}")
    println("nome ${contaHugo.titular.endereco.logradouro}")

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

    try {
        contaFran.tranfere(500.0, contaHugo, 1)
        println("Sucesso na transferencia")
    } catch (e: SaldoInsuficienteException) {
        println("FALHA na transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("FALHA na transferencia")
        println("FALHA na autentica????o")
        e.printStackTrace()
    } catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println(contaHugo.saldo)
    println(contaFran.saldo)

//    println("==TIPOS DE CONTAS==")
//
//    val contaCorrente = ContaCorrente(hugo, 1000)
//    val contaPoupanca = ContaPoupanca(fran, 1001)
//
//    contaCorrente.deposita(1000.0)
//    contaPoupanca.deposita(1000.0)
//
//    println("Saldo corrente: ${contaCorrente.saldo}")
//    println("Saldo corrente: ${contaPoupanca.saldo}")
//
//    contaCorrente.saca(100.0)
//    contaPoupanca.saca(100.0)
//
//    println("Ap??s saque, Saldo corrente: ${contaCorrente.saldo}")
//    println("Ap??s saque, Saldo corrente: ${contaPoupanca.saldo}")
//
//    contaCorrente.tranfere(100.0, contaPoupanca, 1)
//
//    println("saldo corrente ap??s transferir para poupan??a: ${contaCorrente.saldo}")
//    println("saldo poupan??a ap??s receber transferencia: ${contaPoupanca.saldo}")
//
//    contaPoupanca.tranfere(100.0, contaCorrente, 2)
//
//    println("saldo poupan??a ap??s transferir para corrente: ${contaPoupanca.saldo}")
//    println("saldo corrente ap??s receber transferencia: ${contaCorrente.saldo}")
}