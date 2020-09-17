
public class TelaDeApresentacao {

	private int escolha;
	private String confirmacao;
	private LivrosService regrasDoCatalogo;
	private Livro livros;

	public TelaDeApresentacao() {
		this.regrasDoCatalogo = new LivrosService();
		// Eu tive que criar um objeto para poder ter acesso ao método.
	}

	public LivrosService getRegrasDoCatalogo() {
		return regrasDoCatalogo;
	}

	public void setRegrasDoCatalogo(LivrosService regrasDoCatalogo) {
		this.regrasDoCatalogo = regrasDoCatalogo;
	}

	public void inicioDaAplicacao() {
		System.out.println("1 - Cadastrar no livro \n" + "2 - Atualizar livro \n" + "3 - Listar todos os livros \n"
				+ "4 - Realizar busca por livro \n" + "5 - Realizar busca por autor \n"
				+ "6 - Realizar busca por categoria \n" + "7 - Remover item do catálogo\n"
						+ "8 - Sair\nDigite abaixo uma das escolhas: ");
	}

	public void escolha(int escolha, String nome, String autor, String categoria) {

		if (escolha == 1) {

			// regrasDoCatalogo.cadastrarLivroParte1();
			regrasDoCatalogo.cadastrarLivroParte2(nome, autor, categoria);
		}
	}

	public void escolha(int escolha, int index, String nome, String autor, String categoria) {
		if (escolha == 2) {

			regrasDoCatalogo.atualizarLivro(index, nome, autor, categoria);
		}

	}

	public void escolha(int escolha) {
		switch (escolha) {

		case 3:
			regrasDoCatalogo.listarLivro();
			break;
		
		
		}
	}
	public void escolha(int escolha, String valor) {
		if (escolha == 4) {
		
			regrasDoCatalogo.realizarBuscaPorNome(valor);
		}
	
		if (escolha == 5) {
			regrasDoCatalogo.realizarBuscaPorAutor(valor);
		}
		
		if(escolha == 6) {
			regrasDoCatalogo.realizarBuscaPorCategoria(valor);
		}
	}
	
	public void escolha(int escolha, int index, String resposta) {
		if (escolha == 7) {
			regrasDoCatalogo.realizarRemocao(index, resposta);
		}
	}
	public boolean sair(String confirmacao) {
		if (confirmacao.equals("S")) {
			return true;
		} else {
			return false;
		}

	}

}
