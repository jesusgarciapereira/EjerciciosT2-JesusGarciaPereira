package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	/*
	 * ENTRADA: 4.7 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: dígitos | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 */
	// ENTRADA: 0 | RESULTADO ESPERADO: Introduzca un número mayor que 0
	// ENTRADA: 5 | RESULTADO ESPERADO: El número 5 tiene 1 cifras
	// ENTRADA: 223 | RESULTADO ESPERADO: El número 223 tiene 3 cifras
	// ENTRADA: 3456543 | RESULTADO ESPERADO: El número 3456543 tiene 7 cifras

	public static void main(String[] args) {

		// Declaramos la variables
		int num = 0;
		int numAuxiliar;
		int contCifras = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Número de dígitos");
		System.out.println("-----------------");

		do {
			try {
				// Le pedimos al usuario un número y lo leemos
				System.out.println("Introduzca un número mayor que 0");
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

		// Hacemos una copia del número original para no modificarlo
		numAuxiliar = num;

		// Bucle while para contar las cifras del número
		while (numAuxiliar > 0) {
			numAuxiliar /= 10;
			contCifras++;
		}

		// Mostramos el resultado
		System.out.println("El número " + num + " tiene " + contCifras + " cifras");

		// Cerramos el Scanner
		sc.close();
	}
}
