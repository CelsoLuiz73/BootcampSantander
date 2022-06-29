package one.digiOneBank.testes

import one.digiOneBank.Funcionario
import one.digiOneBank.Pessoa
import java.math.BigDecimal


fun main() {
    val jether = Pessoa(nome = "Jether Rodrigues", cpf = "123456789")
    println(jether.nome)
    println(jether.cpf)
    println("Meu nome é " + jether.nome + " e meu o meu CPF é " + jether.cpf)

    val joao = Funcionario("Jether Rodrigues", "123456789", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}