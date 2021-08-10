package br.com.alura.bytebank.collections

class BancoDeDados {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }

}