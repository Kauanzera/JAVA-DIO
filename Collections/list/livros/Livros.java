package collections.list.livros;

public class Livros {
	
	private String livro;
	private String autor;
	private Integer anoPublicacao;

	public Livros() {
	}
		
	public Livros(String livro, String autor, Integer anoPublicacao) {
		this.livro = livro;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String toString() {
		return "Livros [livro=" + livro + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
	
	

}
