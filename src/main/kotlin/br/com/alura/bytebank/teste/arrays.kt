package br.com.alura.bytebank.teste

fun main() {
//    introArrays()
//    salarios()
    ranges()

}

fun introArrays() {
    //    val idade1 = 25
//    val idade2 = 19
//    val idade3 = 33
//    val idade4 = 20

/*    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4) {
        idade1
    } else if (idade2 > idade3 && idade2 > idade4) {
        idade2
    } else if (idade3 > idade4){
        idade3
    }else
        idade4

    println(maiorIdade)*/

    val idades = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade)
            maiorIdade = idade
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)
}

fun salarios(){

    val salarios = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    for(indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed {i, salario ->
        salarios[i] = salario * aumento
    }

}

fun ranges(){

    val serie = 1.rangeTo(10)
    for (s in serie)
        print("$s ")

    println()

    val numerosPares = 2.until(100) step 2
    for (numeroPar in numerosPares)
        print("$numeroPar ")

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach{ print(" $it ") }

    println()
    val alfabeto = 'a'..'z'
    val letrak = 'k'
    val letraK = 'K'
    println("k " + (letrak in alfabeto))
    println("K " + (letraK in alfabeto))

}