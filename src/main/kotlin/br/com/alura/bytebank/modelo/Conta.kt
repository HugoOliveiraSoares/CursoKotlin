package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
): Autenticavel {

    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        total++
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

    fun tranfere(valor: Double, contaDestino: Conta, senha: Int) {

        if (saldo < valor) {
            throw SaldoInsuficienteException(
                "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído $valor"
            )
        }

        if (!autentica(senha))
            throw FalhaAutenticacaoException()

        saldo -= valor
        contaDestino.deposita(valor)
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
}