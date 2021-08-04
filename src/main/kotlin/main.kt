fun main() {

    println("Bem vindo ao ByteBank!")

    val hugo = Funcionario("Hugo", "111111111", 1000.0, 0)

    println("FUNCIONARIO")
    println("nome ${hugo.nome}")
    println("cpf ${hugo.cpf}")
    println("salario ${hugo.salario}")
    println("bonificação ${hugo.bonificacao()}")

}
