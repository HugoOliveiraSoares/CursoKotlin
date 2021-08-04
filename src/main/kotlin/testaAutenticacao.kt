fun testaAutenticacao() {
    val gerente = Gerente("Alex", "111.111.11-11", 1000.0, 1000)

    val diretor = Diretor("Fran", "222.222.22-22", 1000.0, 1234, 200)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1000)
    sistemaInterno.entra(diretor, 1234)
}