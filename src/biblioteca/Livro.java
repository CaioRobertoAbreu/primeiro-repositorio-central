package biblioteca;

public class Livro {
	private String titulo;
	
	public void emprestar() {};
	
	public void devolver() {};

	
	public Livro(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
