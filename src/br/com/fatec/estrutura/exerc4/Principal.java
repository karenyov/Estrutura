package br.com.fatec.estrutura.exerc4;

import br.com.fatec.estrutura.No;

/**
 * @author Karen 4 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 4 – Complete o código a seguir para que seja impresso na tela o
	 * conteúdo dos elementos da lista encadeada
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int nro;
		No inicio = null, no = null;
		for (int i = 0; i < 5; i++) {
			nro = (int) (Math.random() * 10 + 1);
			if (inicio == null) {
				no = new No();
				no.conteudo = nro;
				inicio = no;
			} else {
				no.proximo = new No();
				no = no.proximo;
				no.conteudo = nro;
			}
			System.out.println("Conteudo: " + no.conteudo);
		}
		
		// completar aqui
		while (inicio != null) {
			inicio = inicio.proximo;
			System.out.println(inicio.conteudo);
		}
	}

}
