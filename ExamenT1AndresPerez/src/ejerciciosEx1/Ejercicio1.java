package ejerciciosEx1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Declaramos todas las varibles que vamos a usar.
		int numero = 0;
		int pares = 0;
		int imparesMult = 0;
		int numMayor = 0;
		int menores = 0;
		/*
		 * Creamos un bucle que se repetira 10 veces ya que es lo que pide. Empieza en 1
		 * la i para que asi en el sysout aparezca la frase "Introduce el valor 1 en vez
		 * del 0.
		 */
		for (int i = 1; i <= 10; i++) {

			System.out.println("Introduce el valor " + i + " :");
			numero = Integer.parseInt(sc.nextLine());
			/*
			 * Si el numero es divisible entre 2 es par. Al no ser divisible entre 2 ya
			 * sabemos que es impar y solo haria falta añadir la condicion de multiplo de 5.
			 * Aumentaremos las variables que correspondan.
			 */
			if (numero % 2 == 0) {
				pares++;
			} else if (numero % 5 == 0) {
				imparesMult++;
			}
			/*
			 * El primer numero introducido siempre sera el mayor, por lo la primera vez
			 * siempre entrara aqui y actualizara la varible numMayor con el numero. No he
			 * inicializado la varible numMayor a -1 como me explicaste porque es posible
			 * que el usuario solo meta valores negativosy entonces nunca se actualizaria.
			 */
			if (i == 1) {
				numMayor = numero;
			} else if (numero > numMayor) {
				numMayor = numero;
			}
			/*
			 * Si el numero es menor de 18 aumentamos la variable correspondiente
			 */
			if (numero < 18) {
				menores++;
			}

		}
		// Imprimimos todos los valores que nos piden
		System.out.println("Numero de pares introducidos = " + pares);
		System.out.println("Numero de impares y multiplos de 5 introducidos = " + imparesMult);
		System.out.println("Numeros menores de 18 = " + menores);
		System.out.println("El mayor numero introducido ha sido = " + numMayor);
		//Cerramos el scanner
		sc.close();
	}

}
