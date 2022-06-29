package one.digiOneBank.testes

import one.digiOneBank.Banco


fun main() {
    //Desta forma, mesmo tendo condições quais informações devem ser recebidas,
    //pode ocorrer um erro na digitação da informação.
    val digitalHouseBank = Banco("DHB", 10)

    // Utilizamos o recurso chamado de Argumentos Nomeados: Assim, não damos margem,
    // para inclusão de argumentos com valores errados (No atributo nome, informar um número)
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digitalHouseBank.nome)
    println(digitalHouseBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco 2")

    println(banco2.nome)
    println(banco2.numero)

}