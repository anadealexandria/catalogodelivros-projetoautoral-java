import java.util.ArrayList;
import java.util.List;

public class LivrosService {
	private List<String> livros =  new ArrayList<>();
	
	public void cadastrarNovoLivroParte1() {
		System.out.println("Digite um livro para cadastrá-lo (nome, autor, categoria): ");
	}
	
	public void cadastrarNovoLivroParte2(String lista) {
		for(String livro:livros) {
			livros.add(lista);
		}
		
	}
	public void atualizarLivro() {
		
	}
	
	public void listarTodos() {
		
	}
	
	public void realizarBusca() {
		
	}
	
	public void sair() {
		
	}
}
