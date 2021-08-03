class Conta {

    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
        private set(valor){
            if (valor > 0)
                field = valor
        }

    fun deposita(valor: Double) {
        if (valor > 0)
            this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor)
            saldo -= valor
    }

    fun tranfere(valor: Double, contaDestino: Conta): Boolean {

        if (saldo >= valor) {
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        return false

    }

}