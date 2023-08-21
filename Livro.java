
public class Livro {

	private String nome;
	private String autor;
	private int anoDePublicacao;
	private boolean disponibilidade = true;
	public String getNome() {
		return nome;
	}
	
	//Metodos de Emprestar e Devolver algum Livro//
	
	public void emprestarLivro() {
		if (disponibilidade == true) {
			System.out.println("O livro foi emprestado com Sucesso!");
			this.disponibilidade = false;
		} else {
			System.out.println("Este livro está indisponível no momento!");
		}
	}
	
	public void devolverLivro() {
		if (disponibilidade == false) {
			System.out.println("Livro Devolvido com Sucesso!");
			this.disponibilidade = true;
		} else {
			System.out.println("Este Livro não pode ser devolvido, pois não está Emprestado.");
		}
	}
	
	
	//Getters e Setters//
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
}
