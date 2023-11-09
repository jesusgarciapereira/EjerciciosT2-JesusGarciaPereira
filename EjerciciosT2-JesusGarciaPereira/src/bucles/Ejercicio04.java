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
	 * ENTRADA: 0 | RESULTADO ESPERADO: Introduzca un valor para a (mayor que 0)
	 * 
	 * ENTRADA: 34 -4 | RESULTADO ESPERADO: Introduzca un valor para b (mayor que 0)
	 */
	// ENTRADA: 320 180 | RESULTADO ESPERADO: m.c.d.(320,180) = 20
	// ENTRADA: 400 125 | RESULTADO ESPERADO: m.c.d.(400,125) = 25
	// ENTRADA: 1024 625 | RESULTADO ESPERADO: m.c.d.(1024,625) = 1

	public static void main(String[] args) {

		// Declaramos las variables
		int a = 0;
		int b = 0;
		int numMenor;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Máximo común divisor de a y b");
		System.out.println("-----------------------------");

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
