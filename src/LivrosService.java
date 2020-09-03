import java.util.ArrayList;
import java.util.List;

public class LivrosService {
	private List<String> livros;
	private TelaDeApresentacao telaDeApresentacao;

	public LivrosService() {
		livros = new ArrayList<>();
	}

	public List<String> getLivros() {
		return livros;
	}

	public void setLivros(List<String> livros) {
		this.livros = livros;
	}

	public void cadastrarLivroParte2(String nome, String autor, String categoria) {

		for (String livro : livros) {
			livros.add(nome);
			livros.add(autor);
			livros.add(categoria);
		}

	}

	public void atualizarLivro() {

	}
	//O método listar consiste em apontar/MOSTRAR os livros e todas as informações concernentes a eles
//	public List<String> listarLivro() {
//		List<String> lista = new ArrayList<>();
//		for(int i=0 ; i<livros.size(); i++) {
//			 
//			//lista = livros.get(i) + ", " + livros.get(i+1) + ", " + livros.get(i+2);
//		}
//		return
//	}

	public void realizarBusca() {

	}

}
