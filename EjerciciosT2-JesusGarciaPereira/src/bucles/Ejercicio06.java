package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	/*
	 * ENTRADA: 0.6 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: texto | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 */
	// ENTRADA: -1 | RESULTADO ESPERADO: Introduzca un valor para n (entre 0 y 20)
	// ENTRADA: 0 | RESULTADO ESPERADO: Con n asignado a 0 no hay nada que mostrar
	/*
	 * ENTRADA: 4 | RESULTADO ESPERADO: 1 
	 *                                  22 
	 *                                  333 
	 *                                  4444
	 *                                  
	 * ENTRADA: 6 | RESULTADO ESPERADO: 1 
	 *                                  22 
	 *                                  333 
	 *                                  4444
	 *                                  55555
	 *                                  666666
	 */
	// ENTRADA: 21 | RESULTADO ESPERADO: Introduzca un valor para n (entre 0 y 20)

	public static void main(String[] args) {

		// Declaramos la variable
		int n = -1;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Números desde 1 hasta n n-veces");
		System.out.println("-------------------------------");

		do {
			try {

				// Le pedimos al usuario un valor para n y lo leemos
				System.out.println("Introduzca un valor para n (entre 0 y 20)");
				n = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (n < 0 || n > 20);

		// Mostramos el resultado
		if (n == 0)
			System.out.println("Con n asignado a " + n + " no hay nada que mostrar");
		else {

			// Bucle for para las instrucciones de cada fila
			for (int i = 1; i <= n; i++) {

				// Bucle for para mostrar el número de la fila tantas veces como su valor
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}

		// Cerramos el Scanner
		sc.close();
	}
}
