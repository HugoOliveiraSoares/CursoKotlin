class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin(nome, cpf, salario, senha), Autenticavel {

    override fun bonificacao(): Double {
        return salario
    }

}