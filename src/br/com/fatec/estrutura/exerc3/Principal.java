package br.com.fatec.estrutura.exerc3;

/**
 * @author Karen 4 de mar de 2018
 */
public class Principal {

	/**
	 * Exerc�cio 3 � Complete o c�digo a seguir para que seja
impresso na tela o conte�do dos elementos da lista
encadeada.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			 //n�mero aleat�rio no intervalo [5,14]
			 int quant = (int) (Math.random() * 10 + 5);
			 No inicio = new No();
			 No apontador = inicio;
			 inicio.conteudo = quant;
			 while( quant-- > 1 ) {
			 apontador.proximo = new No();
			 apontador = apontador.proximo;
			 apontador.conteudo = quant;
			 System.out.println("quant:" + quant);
			 }
			 //completar aqui
			 _____________________________
			 }

	}

}
