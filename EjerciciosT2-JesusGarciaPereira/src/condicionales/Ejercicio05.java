package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	/*
	 * ENTRADA: cinco | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: 7.8 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 */
	// ENTRADA: 4 | RESULTADO ESPERADO: 4
	// ENTRADA: -3 | RESULTADO ESPERADO: 3
	// ENTRADA: 0 | RESULTADO ESPERADO: 0

	public static void main(String[] args) {

		// Declaramos las variables
		int num = 0;
		int valorAbsoluto;
		boolean correcto = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Valor absoluto");
		System.out.println("--------------");

		do {
			try {
				// Le pedimos al usuario un número y lo leemos
				System.out.println("Introduzca cualquier número entero");
				num = sc.nextInt();

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

		// Establecemos la relación entre las variables
		valorAbsoluto = num < 0 ? -num : num;

		// Mostramos el resultado
		System.out.println("|" + num + "| = " + valorAbsoluto);

		// Cerramos el Scanner
		sc.close();
	}
}
