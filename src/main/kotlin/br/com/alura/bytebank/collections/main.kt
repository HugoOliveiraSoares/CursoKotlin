package br.com.alura.bytebank.collections

fun main() {

    val assistiramCursoDeAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoDeKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoDeAndroid + assistiramCursoDeKotlin

    println(assistiramAmbos.distinct())

}
