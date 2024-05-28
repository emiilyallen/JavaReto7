package TareaNoEvaluable;

public class Biblioteca {

	public Libro libro; 
	public Usuario usuarios; 
	
	//constructor sin parámetros
	
	public Biblioteca() {
	}
	
	
	public Biblioteca(Libro libro, Usuario usuarios) {
		this.libro = libro;
		this.usuarios = usuarios;
	}

	//métodos setters y getters 
	

	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Usuario getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	//metodos de la clase Biblio...
	
	public void agregarLibro(Libro libro){
		
	}
	
	 public void agregarUsuario(Usuario usuario) {
		 
	} 
	 
	public void listaLibros() {
		//recorrer la lista de libros y muestra su info 
	}
	
	public void listaUsuarios() {
		//recorrer la lista de usuarios y mostrar su info
	}


}
