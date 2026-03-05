package conta

fun main(){
    var saldo = 0.0
    var sair = false

    while(!sair){
        println("===============================================================")
        print("[1] - depositar / [2] - sacar / [3] - consultar/ [4] - sair")
        println("===============================================================")

        println("Escolha uma opção:")
        val valor = readLine()?.toInt()
        when(valor){
            1 -> {
                println("Informe o valor do depósito:")
                val deposito = readLine()!!.toDouble()
                saldo = depositar(saldo, deposito)
                println("Saldo Atualizado: R$ $saldo")
            }
            2-> {
                println("Informe o valor do saque:")
                val saque = readLine()!!.toDouble()
                if(saldo>=saque){
                    saldo = sacar(saldo, saque)
                }
                else{
                    println("Saldo Insuficiente! Tente novamente.")
                }
            }
            3-> {
                println(consultar(saldo))
            }
            4->{ sair = true

        }
  }
}
}
