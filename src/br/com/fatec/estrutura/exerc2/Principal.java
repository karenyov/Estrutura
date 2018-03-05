package br.com.fatec.estrutura.exerc2;

import br.com.fatec.estrutura.No;

/**
 * @author Karen 4 de mar de 2018
 */
public class Principal {

	/**
	 * Exercício 2 – Complete a instrução while de modo que o
código seja capaz de imprimir na tela a sequência: 10, 11,
12 e 13
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No a = new No();
		No b = new No();
		No c = new No();
		No d = new No();
		a.conteudo = 10;
		b.conteudo = 11;
		c.conteudo = 12;
		d.conteudo = 13;
		a.proximo = b;
		b.proximo = c;
		c.proximo = d;
		No w = a;
		while (w != null) {
			System.out.println(w.conteudo);
			w = w.proximo;
		}
	}

}
