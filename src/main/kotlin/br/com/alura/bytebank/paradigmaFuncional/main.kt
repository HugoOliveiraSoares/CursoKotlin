package br.com.alura.bytebank.paradigmaFuncional

fun main() {

    val minhaFuncao = ::teste

    println(minhaFuncao())

    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())

}

fun teste() {
    println("executa teste")
}