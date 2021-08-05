package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Int
): FuncionarioAdmin(nome, cpf, salario, senha){

    override fun bonificacao(): Double {
        return salario + plr
    }

}