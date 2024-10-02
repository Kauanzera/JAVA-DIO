package collections.list.ordenacao;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	//Método compareTo usado em comparação entre duas váriaveis
	public int compareTo(Pessoa p) {
		
		//Realizará a comparação entre dois valores, e retornará o maior
		return Integer.compare(idade, p.getIdade());
		//O Integer tem um método que ajuda em formatações com números inteiros
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

}

