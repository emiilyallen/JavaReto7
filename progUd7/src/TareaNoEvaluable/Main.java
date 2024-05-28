package TareaNoEvaluable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 

		int menu; 
		
		
		//libros 
		Libro libro1 = new Libro(" Coraline", "Neil Gaiman ", "Literatura Infantil/Fantasía", 2002, false); 
		Libro libro2 = new Libro(" Momo", "Michael Ende", "Literatura Infantil/Fantasía", 1973, true); 
		Libro libro3 = new Libro(" Holes", "Louis Sachar", "Literatura Juvenil", 1998, true); 

		//usuarios 
		
		Usuario usuario1 = new Usuario("54894856T", "Delia Romero","Calle de la Alegría 2", "641848465"); 
		Usuario usuario2 = new Usuario("21849616F", "Lucia Gomez","Calle del Rosario 15", "6584513684"); 
		Usuario usuario3 = new Usuario("54756483R", "Rosa Lopez","Calle Numancia 43", "768465646"); 

		System.out.println("1. Registrar nuevo libro.\r\n"
				+ "2. Registrar nuevo usuario.\r\n"
				+ "3. Prestar libro a usuario.\r\n"
				+ "4. Devolver libro prestado.\r\n"
				+ "5. Mostrar información detallada de libros disponibles.\r\n"
				+ "6. Mostrar información detallada de usuarios y libros prestados.\r\n"
				+ "7. Buscar libros por título.\r\n"
				+ "8. Buscar libros por autor.\r\n"
				+ "9. Buscar libros por categoría.\r\n"
				+ "10.Salir.");

		System.out.println("");
		System.out.println("");

		System.out.print("Elige una de las siguiente opciones: ");

		menu = sc.nextInt();
		
		switch (menu) {
		case 1: 
			System.out.print("Ha elegido --> Registrar nuevo libro");
			Libro nuevoLibro = new Libro(" Matilda", "Roald Dahl", "Literatura Infantil", 1988, false); 
			System.out.println("");
			System.out.println(nuevoLibro);
			
			break;
		case 2:
			System.out.print("Ha elegido -->Registrar nuevo usuario");
			Usuario nuevoUsuario = new Usuario("70652391W", "Tomás Pérez","Calle de la Alegría 2", "641848465"); 
			System.out.println("");
			System.out.println(nuevoUsuario);
			break; 
			
		case 3:
			System.out.print("Ha elegido -->Prestar libro a usuario");
			System.out.println("");
			libro2.sePresta(); 
			break; 
			
		case 4: 
			System.out.print("Ha elegido -->Devolver libro prestado");
			System.out.println("");
			libro1.seDevuelve(); 
			
			break;
		case 5:
			System.out.print("Ha elegido -->Mostrar información detallada de libros disponibles");
			System.out.println("Libros disponibles: ");
			System.out.println("");
			System.out.println(libro1);
			System.out.println("");
			System.out.println(libro3);
			break; 
			
		case 6:
			System.out.print("Ha elegido -->Mostrar información detallada de usuarios y libros prestados");
			System.out.println("Usuarios registrados: ");
			System.out.println("");
			System.out.println(usuario1);
			System.out.println("");
			System.out.println(usuario2);
			System.out.println("");
			System.out.println(usuario3);
			System.out.println("");
			System.out.println("Libros prestados: ");
			System.out.println(libro2);
			System.out.println("");
			System.out.println(libro3);

			break;
			
		case 7: 
			System.out.print("Ha elegido -->Buscar libros por título");
			//esto ya si que no lo sé hacer 
			System.out.println("Escribe el título del libro que estás buscando: ");
			break;
		case 8:
			System.out.print("Ha elegido -->Buscar libros por autor");
			//esto ya si que no lo sé hacer 

			break; 
			
		case 9:
			System.out.print("Ha elegido -->Buscar libros por categoría");
			//esto ya si que no lo sé hacer 
			break;
			
		case 10:
			System.out.print("Ha elegido -->Salir");

			break;
		default:
			System.out.print("No ha seleccionado ninguna opción");
			break;
		}
	}		
}
