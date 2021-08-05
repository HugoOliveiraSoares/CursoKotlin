import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco("aaa", 123, "asdf", "sadf", "asff", "fasfsfs", "asdfsdf")
    val enderecoNovo = Endereco()

    println(endereco == enderecoNovo)
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${endereco.hashCode()}")

}

fun imprime(any: Any): Any {

    println(any)
    return any

}

