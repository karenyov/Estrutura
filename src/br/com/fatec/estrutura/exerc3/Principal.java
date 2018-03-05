package br.com.fatec.estrutura.exerc3;

import br.com.fatec.estrutura.No;

/**
 * @author Karen 4 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 3 – Complete o código a seguir para que seja impresso na tela o
	 * conteúdo dos elementos da lista encadeada.
	 * 
	 * @param args
	 */
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// número aleatório no intervalo [5,14]
		int quant = (int) (Math.random() * 10 + 5);
		No inicio = new No();
		No apontador = inicio;
		inicio.conteudo = quant;
		while (quant-- > 1) {
			apontador.proximo = new No();
			apontador = apontador.proximo;
			apontador.conteudo = quant;
			System.out.println("quant:" + quant);
		}
		
		No w = inicio;
		while (w != null) {
			System.out.println(w.conteudo);
			w = w.proximo;
		}
				
	}

}
