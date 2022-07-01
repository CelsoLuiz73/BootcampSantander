package one.digiOneBank.testes

import one.digiOneBank.Analista
import one.digiOneBank.Funcionario
import one.digiOneBank.Gerente


fun main() {
    val maria = Gerente("Maria do Carmo", "123456789", (5000.0))
    ImprimeRelatorioFuncionario.imprimir(maria)
}