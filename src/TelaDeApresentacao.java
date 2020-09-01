
public class TelaDeApresentacao {

	private int escolha;
	private String lista;
	private LivrosService regrasDoCatalogo;
	
	
	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public void inicioDaAplicacao() {
		System.out.println("1 - Cadastrar no livro \n" + "2 - Atualizar livro \n" + "3 - Listar todos os livros \n"
				+ "4 - Realizar busca \n" + "5 - Sair\nDigite abaixo uma das escolhas: ");
	}

	public void escolha(int escolha) {
		
		if (escolha == 1) {
			regrasDoCatalogo.cadastrarNovoLivroParte1();
			regrasDoCatalogo.cadastrarNovoLivroParte2(getLista());
		} else if (escolha == 2) {
			regrasDoCatalogo.atualizarLivro();
		} else if (escolha == 3) {
			regrasDoCatalogo.listarTodos();
		} else if (escolha == 4) {
			regrasDoCatalogo.realizarBusca();
		} else if (escolha == 5) {
			regrasDoCatalogo.sair();
		}
	}

}
