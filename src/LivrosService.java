import java.util.ArrayList;
import java.util.List;

public class LivrosService {
	private List<Livro> livros;

	public LivrosService() {
		livros = new ArrayList<>();

	}

	public List<Livro> getLivros() {
		return livros;
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
			System.out.println(i + " - " + livros.get(i));
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

	public void realizarBuscaPorAutor(String autor) {
		List<Livro> autores = new ArrayList<>();
		int contador = 0;
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getAutor().equals(autor)) {
				autores.add(livros.get(i));
				contador++;
			}
		}
		if (contador > 0) {
			for (int i = 0; i < autores.size(); i++) {
				System.out.println(autores.get(i));
			}
		} else {
			System.out.println("Não existe esse autor no material armazenado!");
		}
	}

	public void realizarBuscaPorCategoria(String categoria) {
		List<Livro> categorias = new ArrayList<>();
		int contador = 0;

		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getCategoria().equals(categoria)) {
				categorias.add(livros.get(i));
				contador++;
			}
		}
		if (contador > 0) {
			for (int i = 0; i < categorias.size(); i++) {
				System.out.println(categorias.get(i));
			}
		} else {
			System.out.println("Não existe essa categoria no material armazenado!");
		}
	}

	public void realizarRemocao(int index, String resposta) {
		for (int i = 0; i < livros.size(); i++) {

			if (i == index) {
				if (resposta.equals("s")) {
					livros.remove(livros.get(index));
				} else {
					break;
				}
			}
		}

	}
}
