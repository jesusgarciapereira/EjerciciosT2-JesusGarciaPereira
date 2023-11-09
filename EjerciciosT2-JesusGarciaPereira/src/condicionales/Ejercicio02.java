package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	/*
	 * ENTRADA: 56789.4 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: Mi dni es 77816487 | RESULTADO ESPERADO: El dato introducido no es
	 * del tipo correcto
	 *
	 * ENTRADA: 5687345 | RESULTADO ESPERADO: Introduzca su DNI (sólo las 8 cifras
	 * numéricas)
	 */
	// ENTRADA: 77816487 | RESULTADO ESPERADO: Su NIF es: N
	// ENTRADA: 27289684 | RESULTADO ESPERADO: Su NIF es: T
	/*
	 * ENTRADA: 100000000 | RESULTADO ESPERADO: Introduzca su DNI (sólo las 8 cifras
	 * numéricas)
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		int dni = 0;
		char nif;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Calcule su NIF");
		System.out.println("--------------");

		do {
			try {

				// Le pedimos al usuario su DNI y lo leemos
				System.out.println("Introduzca su DNI (sólo las 8 cifras numéricas)");
				dni = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (dni < 10000000 || dni > 99999999);

// Establecemos la relación entre las variables con un switch
		nif = switch (dni % 23) {
		case 0 -> 'T';
		case 1 -> 'R';
		case 2 -> 'W';
		case 3 -> 'A';
		case 4 -> 'G';
		case 5 -> 'M';
		case 6 -> 'Y';
		case 7 -> 'F';
		case 8 -> 'P';
		case 9 -> 'D';
		case 10 -> 'X';
		case 11 -> 'B';
		case 12 -> 'N';
		case 13 -> 'J';
		case 14 -> 'Z';
		case 15 -> 'S';
		case 16 -> 'Q';
		case 17 -> 'V';
		case 18 -> 'H';
		case 19 -> 'L';
		case 20 -> 'C';
		case 21 -> 'K';
		case 22 -> 'E';
		default -> ' ';
		};

// Mostramos el resultado
		System.out.println("Su NIF es: " + nif);
		System.out.println("El DNI completo sería: " + dni + "-" + nif);

// Cerramos el Scanner
		sc.close();
	}
}
