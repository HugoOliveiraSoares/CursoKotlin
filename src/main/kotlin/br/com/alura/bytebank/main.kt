import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.dizOi
import br.com.alura.bytebank.teste.testaExpressao

fun main() {
//    println("início main")
//    funcao1()
//    println("fim main")

    dizOi("Hugo") { parametro ->
        println("Codigo de dentro da função")
        return@dizOi "Oiiiii, ${parametro}"
    }

}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")

    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw SaldoInsuficienteException()
    }

    println("fim funcao2")
}