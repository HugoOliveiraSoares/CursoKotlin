package br.com.alura.bytebank.paradigmaFuncional

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
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
//    higher order function
fun teste(test: Int, block: () -> Unit): () -> Unit {

}*/