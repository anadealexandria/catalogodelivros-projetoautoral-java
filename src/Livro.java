
public class Livro {

	private String nome;
	private String autor;
	private String categoria; 
	
	public Livro()	{
		
	}
	public Livro(String nome, String autor, String categoria) {
		this.nome = nome;
		this.autor = autor;
		this.categoria = categoria;
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
	
	@Override
	public String toString() {
		return nome + ", " + autor + ", " + categoria ;
	}
	 
}
