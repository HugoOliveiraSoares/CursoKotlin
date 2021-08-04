abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {

//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }
//    open val bonificacao: Double get() = salario * 0.1

    abstract fun bonificacao(): Double

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        }
        return false
    }


}