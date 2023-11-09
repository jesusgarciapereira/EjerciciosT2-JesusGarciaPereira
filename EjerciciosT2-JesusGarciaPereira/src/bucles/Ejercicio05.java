package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
	
	/*
	 * ENTRADA: 1.2 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: mcm | RESULTADO ESPERADO: El dato introducido no es del
	 * tipo correcto
	 * 
	 * ENTRADA: 0 | RESULTADO ESPERADO: Introduzca un valor para a (mayor que 0)
	 * 
	 * ENTRADA: 34 -4 | RESULTADO ESPERADO: Introduzca un valor para b (mayor que 0)
	 */
	// ENTRADA: 320 180 | RESULTADO ESPERADO: m.c.m.(320,180) = 2880
	// ENTRADA: 400 125 | RESULTADO ESPERADO: m.c.m.(400,125) = 2000
	// ENTRADA: 56 156 | RESULTADO ESPERADO: m.c.m.(56,156) = 2184

	public static void main(String[] args) {

		// Declaramos las variables
		int a = 0;
		int b = 0;
		int numMayor;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Mínimo común múltiplo de a y b");
		System.out.println("------------------------------");

		do {
			try {

				// Le pedimos al usuario un valor para a y lo leemos
				System.out.println("Introduzca un valor para a (mayor que 0)");
				a = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (a < 1);

		do {
			try {

				// Le pedimos al usuario un valor para b y lo leemos
				System.out.println("Introduzca un valor para b (mayor que 0)");
				b = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (b < 1);

		// Establecemos la relación entre las variables
		numMayor = a >= b ? a : b;

		// Bucle while para determinar un múltiplo de a y b
		while (numMayor % a != 0 || numMayor % b != 0)
			numMayor++;

		// Mostramos el resultado
		System.out.println("m.c.m.(" + a + "," + b + ") = " + numMayor);

		// Cerramos el Scanner
		sc.close();
	}

}
