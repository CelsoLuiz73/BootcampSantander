package one.digiOneBank.testes

import one.digiOneBank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprimir(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}