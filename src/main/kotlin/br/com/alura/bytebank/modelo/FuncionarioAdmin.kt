package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(nome, cpf, salario), Autenticavel {

//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }
//    open val bonificacao: Double get() = salario * 0.1

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }


}