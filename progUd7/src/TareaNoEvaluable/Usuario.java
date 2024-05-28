package TareaNoEvaluable;

import java.util.Date;

public class Usuario extends Persona implements Prestable{
	
	public String id, nombre, direccion, telefono;
	
	//constr sin parametros 
	
	public Usuario() {
		super();
	}
	
	//const con parametros 
	
	public Usuario(String id, String nombre, String direccion, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//setters y getters 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//otros metodos de la interfaz Prestable 

	@Override
	public void prestarLibro(Libro libro, Date fecha) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void devolverLibro(Libro libro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Nuevo Usuario registrado [id = " + id + ", nombre = " + nombre + ", dirección = " + direccion + ", teléfono = " + telefono + "]";
	} 
	

}
