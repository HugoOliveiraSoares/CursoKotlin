package br.com.alura.bytebank.modelo

var totalContas = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) {

    var saldo = 0.0
        protected set

    init {
        totalContas++
    }

//    constructor(titular: String, numeroConta: Int) {
//        this.titular = titular
//        this.numeroConta = numeroConta
//    }


    fun deposita(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun tranfere(valor: Double, contaDestino: Conta): Boolean {

        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false

    }

}