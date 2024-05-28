package Vehiculo;

public abstract class Turismo extends Vehiculo{
	
	//Será un tipo enumerado que almacena los siguientes valores
	//{RECLINABLES, CUERO, CALEFACCION}. Este tipo enumerado se llamará Asientos.
	
	
	Asientos tipoAsientos;  
	
	public Turismo(String marca, String modelo, String numBastidor, int numPuertas, Asientos tipoAsientos) {
		super(marca, modelo, numBastidor, numPuertas);
		this.tipoAsientos = tipoAsientos;
	}

	public Asientos getTipoAsientos() {
		return tipoAsientos;
	}

	public void setTipoAsientos(Asientos tipoAsientos) {
		this.tipoAsientos = tipoAsientos;
	}

	@Override
	public String toString() {
		return super.toString()+"Turismo [tipoAsientos=" + tipoAsientos + "]";
	} 
	
	double calcularPrecioAlquiler(int dias) {
		return dias;	
	}
	
	int getMaxVelocidad() {
		return 0;
	}
	
}
