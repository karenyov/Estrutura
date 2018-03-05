package br.com.fatec.estrutura;

/**
 * @author Karen 4 de mar de 2018
 */
public class Lista {
	No inicio;

	Lista() {
		/* a lista est� vazia */
		inicio = null;
	}

	void inserir(int nro) {
		/* criar um n� */
		No no = new No();
		no.conteudo = nro;
		no.proximo = null; /* este ser� o �ltimo n� da lista */

		/* checa se a lista est� vazia */
		if (inicio == null) {
			inicio = no;
		} else {
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while (ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}
			/* alterar o pr�ximo do �ltimo para o endere�o do no */
			ultimo.proximo = no;
		}
	}

	void imprimir() {
		/* checa se a lista est� vazia */
		if (inicio == null) {
			System.out.println("Lista vazia");
		}

		else {
			System.out.println(); /* quebra de linha na tela */
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while (ultimo != null) {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			}
		}
	}
}
