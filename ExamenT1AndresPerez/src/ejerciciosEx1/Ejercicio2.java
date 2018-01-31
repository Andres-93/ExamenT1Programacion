package ejerciciosEx1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int cifras = 0;
		int numInvert = 0;

		System.out.println("Introduzca el numero deseado (positivo y con 5 cifras): ");
		numero = Integer.parseInt(sc.nextLine());
		// Guardaremos el numero de cifras del numero en una variable.
		cifras = contadorCifras(numero);
		/*
		 * Comprobaremos que el numero cumple las condiciones dadas gracias al metodo
		 * comprobarNumero y si no las cumple le pediremos otro.
		 */
		while (!comprobarNumero(numero, cifras)) {
			System.out.println("Error, su número debe contener 5 cifras y ser positivo");
			System.out.println("Introduzcalo de nuevo: ");
			numero = Integer.parseInt(sc.nextLine());
			cifras = contadorCifras(numero);
		}
		/*
		 * Invertiremos el numero para una mayor comodidad a la hora de imprimirlo por
		 * pantalla
		 */
		numInvert = invertirNum(numero, numInvert);
		// Mediante un for imprimimos el numero.
		for (int i = 0; i < 5; i++) {
			System.out.println("El " + (numInvert % 10));
			numInvert = numInvert / 10;
		}

		sc.close();
	}

	// Metodo que cuenta las cifras de un numero.
	private static int contadorCifras(int numero) {

		int numCifras = 0;

		while (numero > 0) {
			numero = numero / 10;
			numCifras++;
		}
		return numCifras;
	}

	/*
	 * Metodo que comprueba si el numero cumple las condiciones deseadas en este
	 * caso mayor de 5 y positivo
	 */
	private static boolean comprobarNumero(int numero, int cifras) {

		boolean resultado = true;

		if ((cifras != 5) || (numero < 0)) {
			resultado = false;
		}

		return resultado;
	}

	// Metodo que recibira un numero y devolvera el mismo invertido.
	private static int invertirNum(int numero, int numInvert) {

		while (numero > 0) {
			numInvert = (numero % 10) + (numInvert * 10);
			numero = numero / 10;
		}

		return numInvert;
	}
}
