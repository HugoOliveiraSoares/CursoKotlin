package br.com.alura.bytebank.collections

fun main() {

    val assistiramCursoDeAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoDeKotlin = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoDeAndroid + assistiramCursoDeKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoDeAndroid)
    assistiramAmbos.addAll(assistiramCursoDeKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

}
