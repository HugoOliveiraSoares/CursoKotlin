package br.com.alura.bytebank.paradigmaFuncional

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

//    val endereco = Endereco("Rua Vergueiro", 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

//    Endereco("Rua Vergueiro", 3185)
//        .run {
//            "$logradouro, $numero".toUpperCase()
//    }.let (::println)

//    run {
//        println("execução do run sem extensão")
//    }

//    val endereco = Endereco("Rua Vergueiro", 3185)
    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
        logradouro = "Rua Vergueiro"
        numero = 3185
    }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)

    listOf(Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })

/*    higher order function
    "".let(::testeRecebeString)

    teste(1) {}*/

}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {

    resultado(a + b)

}

/*
fun testeRecebeString(valor: String){

}

//    higher order function
fun teste(test: Int, block: () -> Unit): () -> Unit {

}*/
