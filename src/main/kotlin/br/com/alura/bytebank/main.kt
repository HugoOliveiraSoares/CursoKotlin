import br.com.alura.bytebank.modelo.*

fun main() {


    val fran = object: Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("Nome ${fran.nome}")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("Bem vindo ao ByteBank!")

    val alex = Cliente(nome="Alex", cpf="", senha=1)
    val contaCorrente = ContaCorrente(titular = alex, numeroConta = 1000)
    val contaPoupanca = ContaPoupanca(titular = alex, numeroConta = 1000)

//    testaComportamentosConta()

    println("Total de contas: ${Conta.total}")

}












