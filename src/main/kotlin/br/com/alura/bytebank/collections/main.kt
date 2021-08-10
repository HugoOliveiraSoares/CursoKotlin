package br.com.alura.bytebank.collections

fun main() {

    val banco = BancoDeDados()
//    banco.nomes.add("Alex")
    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeDados().nomes)


}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("Alex", "Fran", "Gui", "Maria", "Ana")

    for (nome in nomes.iterator())
        println(nome)

    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}