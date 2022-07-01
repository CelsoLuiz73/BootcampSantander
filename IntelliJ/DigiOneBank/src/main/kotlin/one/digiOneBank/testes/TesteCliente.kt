package one.digiOneBank.testes

import one.digiOneBank.Cliente
import one.digiOneBank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.123.123.67",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}