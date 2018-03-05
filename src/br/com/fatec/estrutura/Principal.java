package br.com.fatec.estrutura;

/**
 * @author Karen 4 de mar de 2018
 */
public class Principal {

	/**
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
		System.out.println(a.proximo.proximo.conteudo);
	}

}
