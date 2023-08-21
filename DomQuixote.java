
public class DomQuixote {

	public static void main(String[] args) {
		
		Livro domQuixote = new Livro();
		
		domQuixote.setNome("Dom Quixote");
		domQuixote.setAutor("Miguel de Cervantes");
		domQuixote.setAnoDePublicacao(1605);
		
		System.out.println(domQuixote.getNome());
		System.out.println(domQuixote.getAutor());
		System.out.println(domQuixote.getAnoDePublicacao());
		System.out.println(domQuixote.isDisponibilidade());
		
		domQuixote.emprestarLivro();
		
		System.out.println(domQuixote.isDisponibilidade());
		
		domQuixote.emprestarLivro();
		
		domQuixote.devolverLivro();
		
		

	}

}
