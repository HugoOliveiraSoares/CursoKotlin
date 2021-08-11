package br.com.alura.bytebank.paradigmaFuncional

class Soma : (Int, Int) -> Int {

    override fun invoke(p1: Int, p2: Int): Int = p1 + p2


}