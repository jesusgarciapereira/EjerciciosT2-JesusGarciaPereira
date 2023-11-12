package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * ENTRADA: 34.5 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: n número | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: 0 | RESULTADO ESPERADO: Introduzca un valor para n (a partir de 1)
	 */
	// ENTRADA: 1 | RESULTADO ESPERADO: Entre el 1 y el 1 hay 0 número(s) primo(s)
	// ENTRADA: 2 | RESULTADO ESPERADO: Entre el 1 y el 2 hay 1 número(s) primo(s)
	// ENTRADA: 5 | RESULTADO ESPERADO: Entre el 1 y el 5 hay 3 número(s) primo(s)
	// ENTRADA: 10 | RESULTADO ESPERADO: Entre el 1 y el 10 hay 4 número(s) primo(s)

	public static void main(String[] args) {

		// Declaramos las variables
		int n = 0;
		int contadorPrimos = 0;
		boolean esPrimo;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Cantidad de números primos entre 1 y n");
		System.out.println("--------------------------------------");

		do {
			try {

				// Le pedimos al usuario un valor para n y lo leemos
				System.out.println("Introduzca un valor para n (a partir de 1)");
				n = sc.nextInt();

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (n < 1);

		// Bucle for para incrementar el contador de números primos
		for (int i = 2; i <= n; i++) {
			esPrimo = true;

			// Bucle for para determinar si un número es primo
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo)
				contadorPrimos++;
		}

		// Mostramos el resultado
		System.out.println("Entre el 1 y el " + n + " hay " + contadorPrimos + " número(s) primo(s)");

		// Cerramos el Scanner
		sc.close();
	}
}
