package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * ENTRADA: 78.3 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: capicúa | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 *
	 * ENTRADA: -1 | RESULTADO ESPERADO: Introduzca un número (a partir de 0)
	 * 
	 * ENTRADA: 7 | RESULTADO ESPERADO: El inverso de 7 es 7. Por tanto, es capicúa
	 * 
	 * ENTRADA: 13 | RESULTADO ESPERADO: El inverso de 13 es 31. Por tanto, no es
	 * capicúa 
	 * 
	 * ENTRADA: 77 | RESULTADO ESPERADO: El inverso de 77 es 77. Por tanto,
	 * es capicúa 
	 * 
	 * ENTRADA: 456 | RESULTADO ESPERADO: El inverso de 456 es 654. Por
	 * tanto, no es capicúa 
	 * 
	 * ENTRADA: 6776 | RESULTADO ESPERADO: El inverso de 6776
	 * es 6776. Por tanto, es capicúa
	 * 
	 */

	public static void main(String[] args) {

		// Declaramos la variables
		int num = -1;
		int numInverso = 0;
		int unidad;
		int numAuxiliar;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Capicúa");
		System.out.println("-------");

		do {
			try {

				// Le pedimos al usuario un número y lo leemos
				System.out.println("Introduzca un número (a partir de 0)");
				num = sc.nextInt();

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (num < 0);

		// Hacemos una copia del número original para no modificarlo
		numAuxiliar = num;

		// Bucle while para invertir el número
		while (numAuxiliar > 0) {
			unidad = numAuxiliar % 10;
			numInverso = numInverso * 10 + unidad;
			numAuxiliar = numAuxiliar / 10;
		}

		// Mostramos el resultado
		System.out.print("El inverso de " + num + " es " + numInverso + ". ");
		System.out.println("Por tanto, " + (num == numInverso ? "es capicúa" : "no es capicúa"));

		// Cerramos el Scanner
		sc.close();
	}
}
