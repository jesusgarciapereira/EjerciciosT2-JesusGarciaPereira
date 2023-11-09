package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

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
				System.out.println("Introduzca un valor para a");
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
				System.out.println("Introduzca un valor para b");
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

		for (int i = numMayor;; i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println("m.c.m.(" + a + "," + b + ") = " + i);
				break;
			}
		}
		sc.close();
	}

}
