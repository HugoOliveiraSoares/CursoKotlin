import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente("Alex", "111.111.11-11", 1000.0, 1000)

    val diretor = Diretor("Fran", "222.222.22-22", 1000.0, 1234, 200)

    val cliente = Cliente("Gui", "333.333.33-33", 4321)

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 1000)
    sistemaInterno.entra(diretor, 1234)
    sistemaInterno.entra(cliente, 4321)

}