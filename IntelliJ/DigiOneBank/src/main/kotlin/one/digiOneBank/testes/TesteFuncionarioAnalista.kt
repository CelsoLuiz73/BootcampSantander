package one.digiOneBank.testes

import one.digiOneBank.Analista

fun main() {
    val joao = Analista("João Pedro", "123456789", (2000.0))
    ImprimeRelatorioFuncionario.imprimir(joao)
}