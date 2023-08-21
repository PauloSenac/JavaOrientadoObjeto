
public class LivroDigitalTeste {
	public static void main(String[] args) {
		
		LivroDigital l1 = new LivroDigital();
		
		l1.emprestarLivro();
		
		System.out.println(l1.isDisponibilidade());
	}
}
