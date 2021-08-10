package br.com.alura.bytebank.collections

fun main() {

    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    testaMap(pedidos)

}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
//    val pedido = pedidos[1]
//
//    pedido?.let {
//        println("Pedido $it")
//    }

    for (pedido in pedidos) {
        println("Numero do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos[5] = 80.0
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)


    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}
