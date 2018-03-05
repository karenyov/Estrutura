package br.com.fatec.estrutura.lista3;

/**
 * @author Karen 4 de mar de 2018
 */
public class Lista {
	No inicio;

	public Lista() {
		/* a lista est� vazia */
		inicio = null;
	}

	public void inserir(int nro) {
		No no = new No();/* criar um n� */
		no.conteudo = nro;

		No anterior = null; /* ponteiro para o elemento anterior */
		No atual = inicio; /* ponteiro para o elemento atual */

		/* procura a posi��o de inser��o */
		while (atual != null && atual.conteudo < nro) {
			anterior = atual;
			atual = atual.proximo;
		}

		if (anterior == null) {
			/* insere antes do in�cio */
			no.proximo = inicio;
			inicio = no;
		} else {
			/* insere no meio ou final da sequ�ncia */
			no.proximo = anterior.proximo;
			anterior.proximo = no;
		}
	}

	public void imprimir() {
		/* checa se a lista est� vazia */
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			System.out.println(); /* quebra de linha na tela */
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while (ultimo != null) {
				System.out.print(ultimo.conteudo + " ");
				ultimo = ultimo.proximo;
			}
		}
	}

	/* ir� retornar o n� que possui o nro ou null caso contr�rio */
	public No buscar(int nro) {
		No atual = inicio;
		/* percorre at� encontrar o nro ou o fim da lista */
		while (atual != null && atual.conteudo != nro) {
			atual = atual.proximo;
		}
		return atual;
	}

	/*
	 * ir� retornar o n� que possui o nro ou null caso contr�rio. A busca ser�
	 * por recursividade
	 */
	No buscar(int nro, No no) {
		if (no == null)
			return null;
		else if (no.conteudo == nro)
			return no;
		else
			return buscar(nro, no.proximo);
	}

	void remover(int nro) {
		No anterior = null; /* ponteiro para o elemento anterior */
		No atual = inicio; /* ponteiro para o elemento atual */

		/* procura o n� que possui o nro */
		while (atual != null && atual.conteudo != nro) {
			anterior = atual;
			atual = atual.proximo;

		}

		if (anterior == null && atual != null) {
			/* o nro est� no 1o n� */
			inicio = atual.proximo;
		}
		/* atual ser� null quando o nro n�o existir */
		else if (atual != null) {
			/* remove do meio ou final da sequ�ncia */
			anterior.proximo = atual.proximo;
		}
	}
	
	public void last() {
		/* checa se a lista est� vazia */
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			System.out.println(); /* quebra de linha na tela */
			/* percorrer a lista at� encontrar o �ltimo n� */
			No ultimo = inicio;
			while (inicio != null) {
				inicio = inicio.proximo;
				ultimo = inicio;
				System.out.println(inicio.conteudo);
			}
			
			if(inicio == null) {
				System.out.print("Last: " + ultimo);
			}
		}
	}

}
