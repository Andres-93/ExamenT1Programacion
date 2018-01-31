package ejerciciosEx1;

import java.util.Scanner;

public class UsoPersona {
	// Declaramos una constante con el año actual.
	final static int ANIO_ACTUAL = 2017;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombre;
		String apellido;
		char respuesta;
		int edad;
		int año;
		int mayorEdad = 0;
		int menorEdad = 0;
		/*
		 * He creado 3 objetos de tipo persona, uno para la persona que se introduce en
		 * el bucle y otros para la persona de mayor edad y para la persona de menor
		 * edad. *
		 */
		Persona persona1 = null;
		/*
		 * He inicializado los atributos de los dos objetos persona mayor y menor con
		 * valores inventados, el año de la persona mayor he puesto 3000 para que asi la
		 * primera persona que metamos en el bucle sea la mayor y el año del menor he
		 * puesto 0 por el mismo motivo, para que asi el año de la persona mas pequeña
		 * tambien sea siempre la primera.
		 */
		Persona personaMayor = new Persona("PersonaMayor", "ApellidoMenor", 3000);
		Persona personaMenor = new Persona("PersonaMenor", "ApellidoMenor", 0);

		do {
			System.out.println("Introduzca el nombre: ");
			nombre = sc.nextLine();

			System.out.println("Introduzca el apellido: ");
			apellido = sc.nextLine();

			System.out.println("Introduzca el año de nacimiento: ");
			año = Integer.parseInt(sc.nextLine());
			// Actualizamos los atributos del objeto persona1.
			persona1 = new Persona(nombre, apellido, año);
			/*
			 * Si el año de nacimiento de la persona que hemos metido es menor que el de la
			 * personaMayor, sabremos que la persona introducida es mayor que la que habia.
			 * Ej: 1990 < 2010, por lo tanto la persona es mayor. En caso de que el año de
			 * nacimiento sea mayor, significara que la persona es mas pequeña. Ej: 2010 >
			 * 1990 ,por lo tanto es menor.
			 */
			if (persona1.getAnoNacimiento() < personaMayor.getAnoNacimiento()) {
				personaMayor = persona1;
			}

			if (persona1.getAnoNacimiento() > personaMenor.getAnoNacimiento()) {
				personaMenor = persona1;
			}

			edad = persona1.getEdad(año, ANIO_ACTUAL);
			/*
			 * Si la edad de la persona es mayor o igual a 18 sumamos uno al contador de los
			 * mayores de edad sino, al de menores.
			 */
			if (edad >= 18) {
				mayorEdad++;
			} else {
				menorEdad++;
			}

			System.out.println("¿Desea introducir mas personas? (S/N)");
			respuesta = sc.nextLine().charAt(0);
			// Si no nos introduce ni la S ni la N le volveremos a pedir.
			while (respuesta != 'S' && respuesta != 'N') {
				System.out.println("Error, por favor introduzca un valor valido S/N (Recuerde las mayusculas)");
				respuesta = sc.nextLine().charAt(0);
			}
			// Siempre que el usuario quiera introducir mas repetiremos todo el bucle.
		} while (respuesta == 'S');
		/*
		 * Imprimimos los diferentes objetos gracias al toString de la clase Persona
		 */
		System.out.println("La persona mas joven es:  " + personaMenor);
		System.out.println("La persona mas mayor es:  " + personaMayor);
		System.out.println(
				"Se han introducido " + mayorEdad + " personas mayores de edad y " + menorEdad + " menores de edad");

		sc.close();
	}

}
