package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	// ENTRADA: trescientos | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: 2.2 | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: -5 | RESULTADO ESPERADO: Número incorrecto, sólo válidos a partir del 0
	/*
	 * ENTRADA: 0 | RESULTADO ESPERADO: Exacto, con base y altura 0 no hay nada que
	 * mostrar...
	 */
	/*
	 * ENTRADA: 3 | RESULTADO ESPERADO: * 
	 *                                 * *                              
	 *                                * * *
	 */
	/*
	 * ENTRADA: 5 | RESULTADO ESPERADO: * 
	 *                                 * *                              
	 *                                * * *
	 *                               * * * * 
	 *                              * * * * *  
	 */

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int n;
		/*
		 * Declaramos una variable boolean para determinar si un dato ha sido
		 * introducido correctamente
		 */
		boolean correcto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Triángulo de base y altura n");
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
				while (n < 0) {
					System.out.println("Número incorrecto, sólo válidos a partir del 0");
					System.out.println("Introduzca otro número");
					n = sc.nextInt();
				}
				/*
				 * Si he introducido un dato de tipo incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de correcto seguirá siendo false. Por el
				 * contrario se asignará como true y se ejecutarán las instrucciones siguientes
				 */
				correcto = true;
				// Mostramos la primera parte del resultado
				System.out.println("He aquí un triángulo de base y altura " + n);
				// Salto de línea
				System.out.println();
				// Bucle for que se ejecutará desde el 1 hasta valor correspondiente a n
				for (int i = 1; i <= n; i++) {
					// Bucle for que se ejecutará desde el 1 hasta valor correspondiente a: n - i
					for (int j = 1; j <= n - i; j++) {
						// En cada iteración mostramos un espacio en blanco
						System.out.print(" ");
					}
					// Bucle for que se ejecutará desde el 1 hasta valor correspondiente a i
					for (int j = 1; j <= i; j++) {
						// En cada iteración mostramos un asterisco y espacio en blanco
						System.out.print("*");
						System.out.print(" ");
					}
					// Salto de línea
					System.out.println();
				}
				// Si el valor de n es 0...
				if (n == 0)
					// .. mostraremos el siguiente mensaje
					System.out.println("Exacto, con base y altura " + n + " no hay nada que mostrar...");
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
