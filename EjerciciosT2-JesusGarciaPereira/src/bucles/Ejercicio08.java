package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	/*
	 * ENTRADA: 56.4 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: ahora te lo digo | RESULTADO ESPERADO: El dato introducido no es del
	 * tipo correcto
	 * 
	 */
	// ENTRADA: 0 | RESULTADO ESPERADO: Dime un número inicial:
	// ENTRADA: 4 3 | RESULTADO ESPERADO: Fallo, es menor
	// ENTRADA: 6 6 | RESULTADO ESPERADO: Fallo, es igual
	/*
	 * ENTRADA: 20 23 22 22 0 | RESULTADO ESPERADO: Total números introducidos: 4
	 * Números fallados: 2
	 */

	public static void main(String[] args) {

		// Declaramos la variables
		int num = 0;
		int numAuxiliar = -1;
		int contIntroducidos = 0;
		int contFallos = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Lectura mayores que el anterior");
		System.out.println("-------------------------------");

		do {
			try {

				// Le pedimos al usuario un número inicial y lo leemos
				System.out.print("Dime un número inicial: ");
				num = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (num <= 0);

		// Bucle while para la lectura y conteo de números
		while (num > 0) {
			contIntroducidos++;

			do {
				try {

					/*
					 * Para que no te muestre el texto "Fallo, es igual" en caso de introducir un
					 * tipo incorrecto
					 */
					numAuxiliar = -1;

					// Le pedimos al usuario un nuevo número y lo leemos
					System.out.print("Dime un número: ");
					numAuxiliar = sc.nextInt();

					/*
					 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
					 * error y limpiamos el Scanner
					 */
				} catch (InputMismatchException e) {
					System.out.println("El dato introducido no es del tipo correcto");
					sc.nextLine();
				}

				// Mientras el número no esté dentro del rango, repetiremos las instrucciones
			} while (numAuxiliar < 0);

			// Comprobamos si el número ingresado es menor o igual al anterior
			if (numAuxiliar <= num && numAuxiliar != 0) {
				contFallos++;
				System.out.print("Fallo, ");
				System.out.println(numAuxiliar < num ? "es menor" : "es igual");
			}

			// Actualizamos el número actual con el número ingresado
			num = numAuxiliar;
		}

		// Mostramos el resultado
		System.out.println("Total números introducidos: " + contIntroducidos);
		System.out.println("Números fallados: " + contFallos);

		// Cerramos el Scanner
		sc.close();
	}
}
