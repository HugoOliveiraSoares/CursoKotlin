package br.com.alura.bytebank.teste

fun dizOi(nome: String, msg: (saudacao: String) -> String){

    val resultado = msg(nome)

    println(resultado)

}