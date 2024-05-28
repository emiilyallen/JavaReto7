package Vehiculo;

public abstract class Vehiculo {
	
	protected String marca; 
	protected String modelo;
	protected String numBastidor; //Numero de Bastidor: Código de 17 dígitos formado por letras y números asignado
								//a cada vehículo por el fabricante
	protected int numPuertas;
	protected static int CantidadVehículosFuncionando = 0;

	public Vehiculo(String marca, String modelo, String numBastidor, int numPuertas) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.numPuertas = numPuertas;
		CantidadVehículosFuncionando ++; 
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public static int getCantidadVehículosFuncionando() {
		return CantidadVehículosFuncionando;
	}

	public static void setCantidadVehículosFuncionando(int cantidadVehículosFuncionando) {
		CantidadVehículosFuncionando = cantidadVehículosFuncionando;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", numBastidor=" + numBastidor + ", numPuertas="
				+ numPuertas + "]";
	}
	
	
	
	
}
