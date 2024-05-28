package Vehiculo;

public class Autobus extends Vehiculo{
	
	private int numBus;  //Será de tipo entero y almacena el número de autobús.
	private int numParadas;  //Será también de tipo entero y representa el número total de paradas
						 //que realiza el bus.
	
	public Autobus(String marca, String modelo, String numBastidor, int numPuertas, int numBus, int numParadas) {
		super(marca, modelo, numBastidor, numPuertas);
		this.numBus = numBus;
		this.numParadas = numParadas;
	}

	public int getNumBus() {
		return numBus;
	}

	public void setNumBus(int numBus) {
		this.numBus = numBus;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	@Override
	public String toString() {
		return super.toString()+"Autobus [numBus=" + numBus + ", numParadas=" + numParadas + "]";
	}

	
	





}
