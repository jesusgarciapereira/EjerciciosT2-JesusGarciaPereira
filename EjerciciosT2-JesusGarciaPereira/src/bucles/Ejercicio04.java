package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * ENTRADA: 17.1 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: un valor para a | RESULTADO ESPERADO: El dato introducido no es del
	 * tipo correcto
	 * 
	 * ENTRADA: 0 | RESULTADO ESPERADO: Número incorrecto, sólo válidos a partir del
	 * 1
	 * 
	 * ENTRADA: 34 -4 | RESULTADO ESPERADO: Número incorrecto, sólo válidos a partir
	 * del 1
	 */
	// ENTRADA: 320 180 | RESULTADO ESPERADO: m.c.d.(320,180) = 20
	// ENTRADA: 400 125 | RESULTADO ESPERADO: m.c.d.(400,125) = 25
	// ENTRADA: 1024 625 | RESULTADO ESPERADO: m.c.d.(1024,625) = 1

	public static void main(String[] args) {

		// Declaramos las variables
		int a = 0;
		int b = 0;
		int numMenor;
		boolean correctoA = false;
		boolean correctoB = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Máximo común divisor de a y b");
		System.out.println("-----------------------------");

		do {
			try {

				// Le pedimos al usuario un valor para a y lo leemos
				System.out.println("Introduzca un valor para a");
				a = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (a < 1) {
					System.out.println("Número incorrecto, sólo válidos a partir del 1");
					System.out.println("Introduzca otro número");
					a = sc.nextInt();
				}

				// Asignamos este dato como correcto
				correctoA = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!correctoA);

		do {
			try {

				// Le pedimos al usuario un valor para b y lo leemos
				System.out.println("Introduzca un valor para b");
				b = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (b < 1) {
					System.out.println("Número incorrecto, sólo válidos a partir del 1");
					System.out.println("Introduzca otro número");
					b = sc.nextInt();
				}

				// Asignamos este dato como correcto
				correctoB = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!correctoB);

		// Establecemos la relación entre las variables
		numMenor = a <= b ? a : b;

		/*
		 * Bucle for para determinar si un número es divisor de a y b; y mostramos el
		 * resultado
		 */
		for (int i = numMenor; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println("m.c.d.(" + a + "," + b + ") = " + i);
				if (i == 1)
					System.out.println(a + " y " + b + " son primos entre sí");
				break;
			}
		}

		// Cerramos el Scanner
		sc.close();
	}

}
