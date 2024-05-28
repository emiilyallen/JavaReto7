package TareaNoEvaluable;

public class Libro{

	public String titulo,autor,categoria;
	public boolean prestado; 
	public int añoPublic;
	
	
	//constructor sin parámetros
	public Libro() {
	}

	
	//constructor con parámetros
	public Libro(String titulo, String autor, String categoria, int añoPublic, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.prestado = prestado;
		this.añoPublic = añoPublic;
	}
	
	//getters y setters 
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public boolean getEstadoPrestamo() {
		return prestado;
	}
	public void setEstadoPrestamo(boolean prestado) {
		this.prestado = prestado;
	}
	public int getAñoPublic() {
		return añoPublic;
	}
	public void setAñoPublic(int añoPublic) {
		this.añoPublic = añoPublic;
	} 
	
	public void verificarPrestamo() {
	} 
	
	public void cambiarEstadoPrestamo() {
		
	}
	
	
	//método toString 
	
	@Override		
	public String toString() {
		return "Libro Registrado [título = " + titulo + ", autor = " + autor + ", categoría = " + categoria + ", prestado = "
				+ prestado + ", año de publicación = " + añoPublic + "]";
	}	
	
	
	//metodos de la clase Libro
	
	public void sePresta() {
		System.out.println("El libro titulado" +titulo+ " ha sido prestado");
	}
	
	public void seDevuelve() {
		System.out.println("El libro titulado"+titulo + " ha sido devuelto");

	}
	
}
