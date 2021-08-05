fun testaCondicoes(saldo: Double) {

    when {
        saldo > 0.0 -> println("br.com.alura.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.alura.modelo.Conta é neutra")
        else -> println("br.com.alura.modelo.Conta é negativa")
    }
}