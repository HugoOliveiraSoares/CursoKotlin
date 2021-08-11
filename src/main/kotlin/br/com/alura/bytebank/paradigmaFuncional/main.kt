package br.com.alura.bytebank.paradigmaFuncional

fun main() {

//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }

    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("Executa como anonima")
    }

    println(minhaFuncaoAnonima())

}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::teste

    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}