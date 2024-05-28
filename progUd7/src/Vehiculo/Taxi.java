package Vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable {

	public  final double IMPORTE_INICIO = 2; //Almacena el importe inicial que se cobra al cliente cuando
								//sube al taxi (sería el llamado levantamiento de bandera. Es un atributo cuyo
								//valor fijo será de 2€, de tipo double(con decimales) y no cambia de valor
								//durante la ejecución del programa.
	
	public double kmRecorridos; 	//Representa el número total de kilómetros recorridos, puede tener decimales.
	
	public double importeKm; 
	//Almacena el importe por kilómetro y será utilizado para calcular
	//el coste total de los kilómetros recorridos, puede contener decimales.
	//(Número total de Kilómetros recorridos X importeKm).
	
   						
	public Taxi(String marca, String modelo, String numBastidor, int numPuertas, Asientos tipoAsientos,
			double kmRecorridos, double importeKm) {
		super(marca, modelo, numBastidor, numPuertas, tipoAsientos);
		this.kmRecorridos = kmRecorridos;
		this.importeKm = importeKm;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public double getImporteKm() {
		return importeKm;
	}

	public void setImporteKm(double importeKm) {
		this.importeKm = importeKm;
	}

	public double getIMPORTE_INICIO() {
		return IMPORTE_INICIO;
	}
	

	
	//Metodos interface Calculable
	

	int getMaxVelocidad() {
	return 200;
	
	}
	
	double calcularPrecioAlquiler(int dias) {
		return dias * 50;	
	}
	
	//Metodo interface iniciable 
	
	public void reiniciarContador(double km) {
		System.out.println("---Se procede a reiniciar el kilometraje del primer taxi con un total de: "+ km +" km\n"); 
		
		System.out.println("---kilometraje del primer taxi reiniciado...");
	}


	@Override
	public double calcularCosteTrayecto() {
		
		//no tengo ni idea de si esto es así o no
		double costeTrayecto = kmRecorridos * importeKm + IMPORTE_INICIO;
		System.out.println("---El coste del trayecto para el primer taxi es "+costeTrayecto+" euros");
		
		return costeTrayecto; 

	}

	@Override
	public String toString() {
		return super.toString()+"Taxi [IMPORTE_INICIO=" + IMPORTE_INICIO + ", kmRecorridos=" + kmRecorridos + ", importeKm=" + importeKm
				+ "]" + " Coste del trayecto = 20116.539999999997";
	}
	
	

	
		
}
	
	

	

	
	
	

