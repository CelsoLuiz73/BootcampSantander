package one.digiOneBank.testes

import one.digiOneBank.Pessoa


fun main() {
    val jether = Pessoa(nome = "Jether Rodrigues", cpf = "123456789")
    println(jether.nome)
    println(jether.cpf)
    println("Meu nome é " + jether.nome + " e meu o meu CPF é " + jether.cpf)

}
