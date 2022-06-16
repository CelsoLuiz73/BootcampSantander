programa
{
	
	funcao inicio()
	{
		real janeiro,fevereiro,marco,abril,media, total
		cadeia vendedor

		escreva("Nome do vendedor:")
		leia(vendedor)
		escreva("Total vendas em Janeiro: ")
		leia(janeiro)
		escreva("Total vendas em Fevereiro: ")
		leia(fevereiro)
		escreva("Total vendas em Março: ")
		leia(marco)
		escreva("Total vendas em Abril: ")
		leia(abril)

		total = (janeiro+fevereiro+marco+abril)
		media = (total)/4
		
		escreva("O total vendido pelo vendedor " + vendedor + " é de: " + total)

		escreva("\nO vendedor " + vendedor + " vendeu em média: " + media + " por mês.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */