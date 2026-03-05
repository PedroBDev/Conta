package conta

fun depositar(saldo: Double, deposito: Double): Double{
    return saldo + deposito
}

fun sacar(saldo : Double, saque: Double): Double {
        return saldo - saque

}

fun consultar(saldo: Double): Double {
    return saldo
}