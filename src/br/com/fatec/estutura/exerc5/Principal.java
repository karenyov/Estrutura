package br.com.fatec.estutura.exerc5;

import br.com.fatec.estrutura.No;

/**
 * @author Karen 4 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 5 – Programar o corpo do método imprimir. Esse método deverá
	 * percorrer a lista recursivamente, ou seja, o método imprimir deverá ser
	 * invocado recursivamente até terminar de percorrer a lista encadeada.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		No lista1 = criaLista(6), lista2 = criaLista(4);
		System.out.println("1a lista");
		imprimir(lista1);
		System.out.println("2a lista");
		imprimir(lista2);
	}

	public static No criaLista(int nroElementos) {
		int nro;
		No inicio = null, no = null;
		for (int i = 0; i < nroElementos; i++) {
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
		}
		return inicio;
	}

	public static void imprimir(No no) {
		// completar aqui
		if (no != null) {
			imprimir(no.proximo);
			System.out.println("Conteúdo: " + no.conteudo);
		}
	}

}
