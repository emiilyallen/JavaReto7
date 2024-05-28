package Vehiculo;

public class Main {

	public static void main(String[] args) {

		//Dos objetos de tipo TAXI
		
		Taxi miTaxi1 = new Taxi("Skoda", "GJH", "GYUD7", 4, Asientos.CUERO, 467.78, 43);
		Taxi miTaxi2 = new Taxi("Audi", "SNF", "BSUG4", 2, Asientos.RECLINABLES, 2050.26, 74);
		
		//Dos objetos de tipo PARTICULAR
		Particular miParticular1 = new Particular("Renault", "USH", "NEHK6", 4, Asientos.RECLINABLES,345.4, 32, "Alberto Muñoz", true);
		Particular miParticular2 = new Particular("Susuki", "DJB", "DHNO3", 2, Asientos.CALEFACCION,127.3, 45, "Lucia Lopez", false);
		
		//Un objeto de tipo Autobus 
		
		Autobus miBus = new Autobus("Nissan", "Qashqai", "IVH4", 2, 905, 19);

		
		
		//Primer Taxi
		System.out.println("***Primer Taxi***\n");
		System.out.println(miTaxi1.toString());
		//miTaxi1.calcularCosteTrayecto(); 


		
		System.out.println("");
		
		//Segundo taxi
		System.out.println("***Segundo Taxi***\n");
		System.out.println(miTaxi2.toString()+" Coste del Trayecto =");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		//////////////////////////////////////////////////////////
		
		//Primer Particular
		System.out.println("***Primer Particular***\n");

		System.out.println(miParticular1.toString());
		
		System.out.println("");
		
		//Segundo Particular
		System.out.println("***Segundo Particular***\n");
		System.out.println(miParticular2.toString());
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		/////////////////////////////////////////////////////////
		
		//Primer Autobús
		System.out.println("***Primer Autobús***\n");
		System.out.println(miBus.toString());
		System.out.println("");
		System.out.println("");

		
		
		
		System.out.println("Total de vehículos alquilados o funcionando: "+miTaxi1.getCantidadVehículosFuncionando());
		System.out.println("");

		miTaxi1.reiniciarContador(25000.0);
		miTaxi1.setKmRecorridos(25000.0);

		System.out.println("");
		
		miTaxi1.calcularCosteTrayecto();
		System.out.println("");

		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("***Información actualizada para el primer Taxi***\n");
		System.out.println(miTaxi1.toString());
		
		System.out.println("");
		System.out.println("");
		miParticular1.reiniciarContador(10000);
		System.out.println("");
		
		System.out.println("***Información actualizada para el primer Particular***\n");
		
		
		System.out.println(miParticular1.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Se ha actualizado el nombre del propietario del segundo Particular\n");

		miParticular2.setPropietario(" Mariano Gomez ");
		System.out.println(miParticular2.toString());
		
		
	}

}
