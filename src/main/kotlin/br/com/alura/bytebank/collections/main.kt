package br.com.alura.bytebank.collections

fun main() {

    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )

//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)
    val message = pedidos.getOrElse(1) {
        "Não tem o pedido"
    }
    println(message)

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys)
        println("Pedido $numero")

    println(pedidos.values)

    for (valor in pedidos.values)
        println("Valor do pedido: $valor")

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosPares)

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
