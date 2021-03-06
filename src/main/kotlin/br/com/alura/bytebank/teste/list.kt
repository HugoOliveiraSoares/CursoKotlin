package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Livro

fun main() {

    listaLivros()
//    listaLivrosComNulos()

}

fun listaLivros() {
    val livro1 = Livro(
        "Algoritmos",
        "Cormen",
        2003
    )

    val livro2 = Livro(
        "Iracema",
        "José de Alencar",
        1865,
        "Editora A"
    )

    val livro3 = Livro(
        "Grande Sertão: Veredas",
        "João Guimarães Rosa",
        1956
    )

    val livro4 = Livro(
        "Minha vida de menina",
        "Helena Morley",
        1942,
        "Editora B"
    )


    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

//    livros.imprimeComMarcadores()

    livros.add(
        Livro(
            "Sagarana",
            "João Guimarães Rosa",
            1946
        )
    )

/*    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val titulos: List<String> = livros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)*/

    livros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach{ (editora: String, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}

fun listaLivrosComNulos() {

    val livro1 = Livro(
        "Algoritmos",
        "Cormen",
        2003
    )

    val livro2 = Livro(
        "Iracema",
        "José de Alencar",
        1865,
        "Editora A"
    )

    val livro3 = Livro(
        "Grande Sertão: Veredas",
        "João Guimarães Rosa",
        1956
    )

    val livro4 = Livro(
        "Minha vida de menina",
        "Helena Morley",
        1942,
        "Editora B"
    )

    val livrosComNulos: MutableList<Livro?> = mutableListOf(null, livro1, null, livro2, null, livro3, livro4)

    livrosComNulos.add(
        Livro(
            "Sagarana",
            "João Guimarães Rosa",
            1946
        )
    )

}




