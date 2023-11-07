package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	// ENTRADA: 34.5 | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: n número | RESULTADO ESPERADO: El dato introducido no es correcto
	/*
	 * ENTRADA: 0 | RESULTADO ESPERADO: Número incorrecto, sólo válidos a partir del
	 * 1
	 */
	// ENTRADA: 1 | RESULTADO ESPERADO: Entre el 1 y el 1 hay 0 número(s) primo(s)
	// ENTRADA: 2 | RESULTADO ESPERADO: Entre el 1 y el 2 hay 1 número(s) primo(s)
	// ENTRADA: 5 | RESULTADO ESPERADO: Entre el 1 y el 5 hay 3 número(s) primo(s)
	// ENTRADA: 10 | RESULTADO ESPERADO: Entre el 1 y el 10 hay 4 número(s) primo(s)

	public static void main(String[] args) {

		// Declaramos la variable del número que le pediremos al usuario
		int n;
		// Declaramos la variable del número de primos que mostraremos
		int contadorPrimos = 0;
		// Declaramos una variable boolean para determinar si un número es primo
		boolean esPrimo;
		/*
		 * Declaramos una variable boolean para determinar si un dato ha sido
		 * introducido correctamente
		 */
		boolean correcto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Activamos el Scanner
		System.out.println("Cantidad de números primos entre 1 y n");
		do {
			try {
				// Le pedimos al usuario un valor para n
				System.out.println("Introduzca un valor para n");
				// Leemos el número
				n = sc.nextInt();
				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (n < 1) {
					System.out.println("Número incorrecto, sólo válidos a partir del 1");
					System.out.println("Introduzca otro número");
					n = sc.nextInt();
					/*
					 * Si he introducido un dato incorrecto se ejecutarán directamente las
					 * instrucciones del catch y el valor de correcto seguirá siendo false. Por el
					 * contrario se asignará como true y se ejecutarán las instrucciones siguientes
					 */
					correcto = true;
				}
				// Bucle for que se ejecutará desde el 2 hasta valor asignado a n
				for (int i = 2; i <= n; i++) {
					// Asignamos el valor true a esPrimo
					esPrimo = true;
					/*
					 * Bucle for que se ejecutará desde el 2 hasta valor correspondiente a la raíz
					 * cuadrada de i
					 */
					for (int j = 2; j <= Math.sqrt(i); j++) {
						// Si el valor de i es divisible por alguna j...
						if (i % j == 0) {
							// ... asignamos el valor false a esPrimo
							esPrimo = false;
							// Rompemos el bucle, que se cumpla la condición una sola vez es suficiente
							break;
						}
					}
					// Si esPrimo es true...
					if (esPrimo)
						// ... incrementamos el contador de números primos
						contadorPrimos++;
				}
				// Mostramos el resultado
				System.out.println("Entre el 1 y el " + n + " hay " + contadorPrimos + " número(s) primo(s)");
				// Si he introducido un dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}
		} while (correcto == false);/*
									 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca el
									 * dato correctamente
									 */
		// Cerramos el Scanner
		sc.close();
	}
}
