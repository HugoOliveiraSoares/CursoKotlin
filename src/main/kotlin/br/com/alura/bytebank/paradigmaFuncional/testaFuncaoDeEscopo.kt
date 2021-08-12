package br.com.alura.bytebank.paradigmaFuncional

import br.com.alura.bytebank.modelo.Endereco

fun testaScopeFunctions() {
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
}