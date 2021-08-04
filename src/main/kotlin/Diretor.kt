class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Int
): FuncionarioAdmin(nome, cpf, salario, senha), Autenticavel{

    override fun bonificacao(): Double {
        return salario + plr
    }

}