programa
{
	
	funcao inicio()
	{
		inteiro contador,limite,resultado,valorDigitado,determinarLimite

		contador = 1
		escreva("Digite um valor entre 2 a 10, da tabuada que você quer exibir: ")
		leia(valorDigitado)
		escreva("Digitar qual o limite da tabuada: ")
		leia(determinarLimite)
		escreva("Exibir tabuada do " + valorDigitado + " com o limite de " + determinarLimite + "\n")
		limite = determinarLimite
		escreva("\n")

		faca {

			resultado = valorDigitado * contador
			escreva(valorDigitado + " x " + contador + " = " + resultado + "\n")
			contador++
			
		} enquanto (contador<=limite)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */