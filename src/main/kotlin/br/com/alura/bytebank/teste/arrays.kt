package br.com.alura.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//    introArrays()
//    salarios()
//    ranges()
//    idades()
    salariosComBigDecimal()

}

fun salariosComBigDecimal() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()

    val salariosComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acc, salario ->
        acc + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println(gastoTotal)

}

fun Array<BigDecimal>.somatoria(): BigDecimal{

    return this.reduce{ acumulador, valor ->
        acumulador + valor
    }

}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal())
        salario + "500".toBigDecimal()
    else
        (salario * aumento).setScale(2, RoundingMode.UP)

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {

    return Array<BigDecimal>(valores.size) {i ->
        valores[i].toBigDecimal()
    }

}

fun idades() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média: $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores de idade? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Tem pelo menos um maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores de idade: $maiores")

    // Retorna o primeiro elemento que satisfaz a condição
    val busca = idades.find { it == 18 }
    println(busca)

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