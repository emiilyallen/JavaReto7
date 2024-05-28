package Vehiculo;

public class Particular extends Turismo implements Iniciable{
	
	public String propietario;  //Representa el nombre y apellidos de la persona particular que
								//alquila el vehículo.
	
	public boolean conAireAcondicionado;  //Representa un valor verdadero o falso en caso de que
										  //el vehículo tenga aire acondicionado o no respectivamente.
	
	public Particular(String marca, String modelo, String numBastidor, int numPuertas,
			Asientos tipoAsientos, double kmRecorridos, double importeKm, String propietario,
			boolean conAireAcondicionado) {
		
		super(marca, modelo, numBastidor, numPuertas, tipoAsientos);
		this.propietario = propietario;
		this.conAireAcondicionado = conAireAcondicionado;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public boolean isConAireAcondicionado() {
		return conAireAcondicionado;
	}

	public void setConAireAcondicionado(boolean conAireAcondicionado) {
		this.conAireAcondicionado = conAireAcondicionado;
	}

	
	//Metodos de la interfaz Calculable
	double calcularPrecioAlquiler(int dias) {
		return dias * 30;	
	}
	
	int getMaxVelocidad() {
		return 220;
		
		}
	
	//Metodos de la interfaz Iniciable 
	
	@Override
	public void reiniciarContador(double km) {
		System.out.println("---Se procede a reiniciar kilometraje del primer Particular con un total de "+ km +" km ");
	}

	
	@Override
	public String toString() {
		return super.toString()+" Particular [propietario=" + propietario + ", conAireAcondicionado=" + conAireAcondicionado + "]";
	}

	
	
	
	
}
