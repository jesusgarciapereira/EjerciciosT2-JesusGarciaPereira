package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	/*
	 * ENTRADA: trescientos | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: 2.2 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: -5 | RESULTADO ESPERADO: Número incorrecto, sólo válidos a partir
	 * del 0
	 *
	 * ENTRADA: 0 | RESULTADO ESPERADO: Exacto, con base y altura 0 no hay nada que
	 * mostrar...
	 *
	 *
	 * ENTRADA: 3 | RESULTADO ESPERADO: * 
	 *                                 * * 
	 *                                * * *
	 *
	 * ENTRADA: 5 | RESULTADO ESPERADO: * 
	 *                                 * * 
	 *                                * * * 
	 *                               * * * * 
	 *                              * * * * *
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		int n = 0;
		boolean correcto = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Triángulo de base y altura n");
		System.out.println("----------------------------");

		do {
			try {

				// Le pedimos al usuario un valor para n y lo leemos
				System.out.println("Introduzca un valor para n");
				n = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (n < 0) {
					System.out.println("Número incorrecto, sólo válidos a partir del 0");
					System.out.println("Introduzca otro número");
					n = sc.nextInt();
				}

				// Asignamos este dato como correcto
				correcto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!correcto);

		// Mostramos el resultado
		System.out.println("He aquí un triángulo de base y altura " + n + ":");
		System.out.println();

		if (n == 0)
			System.out.println("Exacto, con base y altura " + n + " no hay nada que mostrar...");
		else {

			// Bucle for para las instrucciones de cada fila
			for (int i = 1; i <= n; i++) {

				// Bucle for para mostrar los espacios que preceden a los asteríscos
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}

				// Bucle for para mostrar los asteríscos
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
					System.out.print(" ");
				}

				System.out.println();
			}
		}

		// Cerramos el Scanner
		sc.close();
	}

}
