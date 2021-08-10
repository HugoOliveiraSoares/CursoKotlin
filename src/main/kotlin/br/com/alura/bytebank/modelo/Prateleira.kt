package br.com.alura.bytebank.modelo

class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {

    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortedBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro> {
        livros.sortedBy { it.anoPublicacao }
        return livros
    }

}