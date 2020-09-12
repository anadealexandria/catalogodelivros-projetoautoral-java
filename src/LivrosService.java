import java.util.ArrayList;
import java.util.List;

public class LivrosService {
	private List<Livro> livros;

	public LivrosService() {
		livros = new ArrayList<>();

	}

	public void cadastrarLivroParte2(String nome, String autor, String categoria) {
		livros.add(new Livro(nome, autor, categoria));

	}

	public void atualizarLivro(int index, String nome, String autor, String categoria) {
		livros.get(index).setNome(nome);
		livros.get(index).setAutor(autor);
		livros.get(index).setCategoria(categoria);

	}

//	 O método listar consiste em apontar/MOSTRAR os livros e todas as informações
//	 concernentes a eles
	public void listarLivro() {
		for (int i = 0; i < livros.size(); i++) {
			System.out.println(livros.get(i));
		}

	}

	public void realizarBuscaPorNome(String nome) {
		List<Livro> nomes = new ArrayList<>();
		int contador = 0;
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNome().equals(nome)) {
				nomes.add(livros.get(i));

				contador++;

			}
		}
		if (contador > 0) {
			for (int i = 0; i < nomes.size(); i++) {
				System.out.println(nomes.get(i));
			}
		} else {
			System.out.println("Não existe esse livro no material armazenado!");
		}
	}

}
