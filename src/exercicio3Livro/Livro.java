package exercicio3Livro;

public class Livro {
	
	private String titulo;
	
	private String autor;
	
	private int numeroPaginas;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		if (numeroPaginas > 5) {
		this.numeroPaginas = numeroPaginas;
		} else {
		System.out.println("Número de páginas inválido");
		}
	}
	
	public String toString() {
		return "--Informações do livro--"
				+ "\n1 - Título da obra: " + titulo
				+ "\n2 - Nome do autor: " + autor
				+ "\n3 - Número de páginas: " + numeroPaginas;
			}
}
