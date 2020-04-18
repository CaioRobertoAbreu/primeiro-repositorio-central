package biblioteca;

public class Livro {
	private String titulo;
	private String numPaginas;
	private String autor;
	
	public void emprestar() {};
	
	public void devolver() {};

	
	public Livro(String titulo) {
		this.titulo = titulo;
	}
	
	public String getNumPaginas() {
		return numPaginas;
	}



	public void setNumPaginas(String numPaginas) {
		this.numPaginas = numPaginas;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
