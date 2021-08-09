import br.com.alura.bytebank.modelo.Endereco

fun main() {

    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua um")
    val logradouro: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
    }

}