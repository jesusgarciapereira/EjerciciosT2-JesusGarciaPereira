package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * ENTRADA: 5.4 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: Hola | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 *
	 * ENTRADA: -1 | RESULTADO ESPERADO: Introduzca un número entre 0 y 9999,
	 * analizaré si es capicúa o no
	 */
	// ENTRADA: 1 | RESULTADO ESPERADO: El número 1 es capicúa
	// ENTRADA: 33 | RESULTADO ESPERADO: El número 33 es capicúa
	// ENTRADA: 45 | RESULTADO ESPERADO: El número 45 no es capicúa
	// ENTRADA: 464 | RESULTADO ESPERADO: El número 464 es capicúa
	// ENTRADA: 478 | RESULTADO ESPERADO: El número 478 no es capicúa
	// ENTRADA: 3553 | RESULTADO ESPERADO: El número 3553 es capicúa
	// ENTRADA: 4564 | RESULTADO ESPERADO: El número 4564 no es capicúa
	/*
	 * ENTRADA: 10000 | RESULTADO ESPERADO: Introduzca un número entre 0 y 9999,
	 * analizaré si es capicúa o no
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		int num = -1;
		boolean esCapicua = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Capicúa");
		System.out.println("-------");

		do {
			try {

				// Le pedimos al usuario un número y lo leemos
				System.out.println("Introduzca un número entre 0 y 9999, analizaré si es capicúa o no");
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
		} while (num < 0 || num > 9999);

		// Verificamos si el número es capicúa
		if (num < 10)
			esCapicua = true;
		else if (num >= 10 && num < 100)
			esCapicua = num / 10 == num % 10;
		else if (num >= 100 && num < 1000)
			esCapicua = num / 100 == num % 10;
		else
			esCapicua = num / 1000 == num % 10 && num / 100 % 10 == num / 10 % 10;

		// Mostramos el resultado
		System.out.print("El número " + num);
		System.out.println(esCapicua ? " es capicúa" : " no es capicúa");

		// Cerramos el Scanner
		sc.close();
	}
}
