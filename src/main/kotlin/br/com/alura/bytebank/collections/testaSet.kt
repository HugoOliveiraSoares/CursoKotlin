package br.com.alura.bytebank.collections

fun testaSet() {
    val assistiramCursoDeAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoDeKotlin = setOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoDeAndroid + assistiramCursoDeKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoDeAndroid)
    assistiramAmbos.addAll(assistiramCursoDeKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoDeAndroid + assistiramCursoDeKotlin)
    println(assistiramCursoDeAndroid union assistiramCursoDeKotlin)

    println(assistiramCursoDeAndroid - assistiramCursoDeKotlin)
    println(assistiramCursoDeAndroid subtract assistiramCursoDeKotlin)

    println(assistiramCursoDeAndroid intersect assistiramCursoDeKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}