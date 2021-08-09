package br.com.alura.bytebank.teste

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria(): BigDecimal {

    return this.reduce{ acumulador, valor ->
        acumulador + valor
    }

}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {

    return Array<BigDecimal>(valores.size) {i ->
        valores[i].toBigDecimal()
    }

}

fun Array<BigDecimal>.media(): BigDecimal {

    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else{
        this.somatoria() / this.size.toBigDecimal()
    }

}