package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )

    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        complemento = "Alura",
        cep = "00000-020"
    )

    println(endereco.equals(enderecoNovo))
    println("1234".hashCode())

//    println(endereco == enderecoNovo)
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
//    println(endereco)
//    println(enderecoNovo)
//
//    println("${endereco.javaClass}@${endereco.hashCode()}")
}