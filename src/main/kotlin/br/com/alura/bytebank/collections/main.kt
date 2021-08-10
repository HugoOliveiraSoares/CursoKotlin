package br.com.alura.bytebank.collections

fun main() {

    val nomes: List<String> = listOf("Alex", "Fran", "Gui", "Maria", "Ana")

    for (nome in nomes.iterator())
        println(nome)

    println(nomes)


}