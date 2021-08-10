package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Livro

fun List<Livro?>.imprimeComMarcadores() {

    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }

    println(" #### Lista de Livros ####")
    println(textoFormatado)

}