
public class LivroDigital extends Livro{
	
	
	// Se o livro é Digital ele sempre estará disponivel//
	public void emprestarLivro() {
		 super.setDisponibilidade(true);
	}
}
