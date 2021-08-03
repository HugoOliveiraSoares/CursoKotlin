class Conta {

    var titular = ""
    var numeroConta = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor)
            saldo -= valor
    }

    fun tranfere(valor: Double, contaDestino: Conta): Boolean {

        if (saldo >= valor) {
            saldo -= valor
            contaDestino.saldo += valor
            return true
        }
        return false

    }

    fun setSaldo(valor: Double){
        saldo = valor
    }

    fun getSaldo(): Double{
        return saldo
    }

}