package collections.list.livros;

public class Main {

	public static void main(String[] args) {

		CatalogoLivros CatLivros = new CatalogoLivros();

		CatLivros.adicionarLivro("Livro 1", "Autor 1", 2024);
		CatLivros.adicionarLivro("Livro 1", "Autor 2", 2023);
		CatLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
		CatLivros.adicionarLivro("Livro 3", "Autor 3", 2021);
		CatLivros.adicionarLivro("Livro 4", "Autor 4", 1999);

		System.out.println(CatLivros.pesquisaPorAutor("Autor 2"));
		System.out.println(CatLivros.pesquisarPorTitulo("Livro 1"));
		System.out.println(CatLivros.pesquisarPorIntervaloAnos(2000, 2022));
		
	}

}
