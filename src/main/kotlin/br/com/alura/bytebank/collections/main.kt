package br.com.alura.bytebank.collections

fun main() {

    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(pedidos)
//    val pedido = pedidos[1]
//
//    pedido?.let {
//        println("Pedido $it")
//    }

    for (pedido in pedidos){
        println("Numero do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }

}
