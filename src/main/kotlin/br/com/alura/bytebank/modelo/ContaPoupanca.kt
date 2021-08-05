package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(titular, numeroConta) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor)
            this.saldo -= valor
    }


}