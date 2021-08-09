package br.com.alura.bytebank.teste

fun main() {
//    introArrays()
    salarios()

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