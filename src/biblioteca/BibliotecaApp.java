package biblioteca;

public class BibliotecaApp {

	public static void main(String[] args) {
		Livro l1 = new Livro("Java - A referencia");
		System.out.println(l1.getTitulo());
		
		Usuario caio = new Usuario();
		
		Emprestimo emprestimo = new Emprestimo();
		
		emprestimo.setLivro(l1);
		emprestimo.setUsuario(caio);
	}

}
