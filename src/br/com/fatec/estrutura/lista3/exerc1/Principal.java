package br.com.fatec.estrutura.lista3.exerc1;

import br.com.fatec.estrutura.lista3.Lista;

/**
 * @author Karen
 * 4 de mar de 2018
 */
public class Principal {

	/**
	 * 1 � Programar na classe Lista, da Figura 9, o m�todo last():No 
	 * para retornar o �ltimo n� da lista. Observa��o: os demais
m�todos n�o podem ser alterados.

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		lista.inserir(20);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(40);
		lista.inserir(8);
		lista.imprimir();
		
		lista.last();

	}

}
