fun main() {

    println("Bem vindo ao ByteBank!")

    val hugo = Funcionario("Hugo", "111111111", 1000.0)

    println("FUNCIONARIO")
    println("nome ${hugo.nome}")
    println("cpf ${hugo.cpf}")
    println("salario ${hugo.salario}")
    println("bonificação ${hugo.bonificacao()}")

    val fran = Gerente("Fran", "2222222", 2000.0, 1234)

    println("\nGERENTE")
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if (fran.autentica(1234))
        println("Autenticou")
    else
        println("Falha na autenticação")


    val gui = Diretor("Gui", "3333333", 4000.0, 4000, 200)

    println("\nDIRETOR")
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao()}")
    println("plr ${gui.plr}")

    if (gui.autentica(4000))
        println("Autenticou")
    else
        println("Falha na autenticação")

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(hugo)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")


}












