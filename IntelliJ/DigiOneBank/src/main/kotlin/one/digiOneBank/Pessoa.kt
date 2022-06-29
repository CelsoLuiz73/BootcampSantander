package one.digiOneBank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123.11"

    fun somar(n1: Int, n2: Int) {
        val oi = (n1 + n2)
        println(oi)
    }
}

fun main() {
    val jether = Pessoa()
    println(jether.nome)
    println(jether.cpf)
    println("Meu nome é " + jether.nome + " e meu o meu CPF é " + jether.cpf)
    jether.somar(5, 10)
}