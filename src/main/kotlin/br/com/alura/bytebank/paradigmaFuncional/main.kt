package br.com.alura.bytebank.paradigmaFuncional

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun main() {

    testaRun()


}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal: $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente("Alex", "111.111.111-11", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let(::println)

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println(rendimentoAnual)
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = 3185
        bairro = "Jonas Veiga"
        cidade = "BH"
        estado = "MG"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
