
public class TelaDeApresentacao {

	private int escolha;
	private String nome;
	private String autor;
	private String categoria;
	private String confirmacao;
	private LivrosService regrasDoCatalogo;

	public TelaDeApresentacao() {
		this.regrasDoCatalogo = new LivrosService();
		// Eu tive que criar um objeto para poder ter acesso ao método.
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void inicioDaAplicacao() {
		System.out.println("1 - Cadastrar no livro \n" + "2 - Atualizar livro \n" + "3 - Listar todos os livros \n"
				+ "4 - Realizar busca \n" + "5 - Sair\nDigite abaixo uma das escolhas: ");
	}

	public void escolha(int escolha, String nome, String autor, String categoria) {
		this.nome = nome;
		this.autor = autor;
		this.categoria = categoria;

		if (escolha == 1) {

			// regrasDoCatalogo.cadastrarLivroParte1();
			regrasDoCatalogo.cadastrarLivroParte2(nome, autor, categoria);
		}
	}

	public void escolha(int escolha) {
		switch (escolha) {
		case 2:
			regrasDoCatalogo.atualizarLivro();
		case 3:
			//regrasDoCatalogo.listarLivro();
		case 4:
			regrasDoCatalogo.realizarBusca();
		}
	}

//	public void escolha(int escolha, String confirmacao) {
//		TelaDeApresentacao tela = new TelaDeApresentacao();
//		if (escolha == 5) {
//
//			tela.sair(confirmacao);
//		}
//	}

	public boolean sair(String confirmacao) {
		if(confirmacao.equals("S")) {
			return true;
		} else {
			return false;
		}
		
	}

}
