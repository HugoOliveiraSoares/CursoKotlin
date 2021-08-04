fun main() {

    println("Bem vindo ao ByteBank!")

    val contaCorrente = ContaCorrente("Hugo", 1000)
    val contaPoupanca = ContaPoupanca("Fran", 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo corrente: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Após saque, Saldo corrente: ${contaCorrente.saldo}")
    println("Após saque, Saldo corrente: ${contaPoupanca.saldo}")

    contaCorrente.tranfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.tranfere(100.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferencia: ${contaCorrente.saldo}")


}












