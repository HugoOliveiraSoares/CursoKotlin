fun testaLacos(){

    var i = 0
    while (i < 5) {
        val titular: String = "Hugo $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i

//    String template
        println("Titular $titular")
        println("Numero conta $numeroConta")
        println("Saldo conta $saldo")
        println("=====================")
        i++
    }

    for (i in 5 downTo 1) {

        if (i == 4)
            continue

        val titular: String = "Hugo $i"
        val numeroConta: Int = 1000 + i
        var saldo = 10.0 + i

//    String template
        println("Titular $titular")
        println("Numero conta $numeroConta")
        println("Saldo conta $saldo")
        println("=====================")
    }
}