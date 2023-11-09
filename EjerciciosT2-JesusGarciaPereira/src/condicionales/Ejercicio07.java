package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

// Pedimos al usuario:
	// 1 - Número correspondiente a las horas
	// 2 - Número correspondiente a los minutos
	// 3 - Número correspondiente a los segundos

	/*
	 * ENTRADA: hora | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: 5.9 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto /*
	 * 
	 * ENTRADA: -1 | RESULTADO ESPERADO: Introduzca el número correspondiente a las
	 * horas (de 0 a 23)
	 * 
	 * ENTRADA: 22 89 | RESULTADO ESPERADO: Introduzca el número correspondiente a
	 * los minutos (de 0 a 59)
	 * 
	 * ENTRADA: 14 59 70 | RESULTADO ESPERADO: Introduzca el número correspondiente
	 * a los segundos (de 0 a 59)
	 *
	 * ENTRADA: 13 45 32 | RESULTADO ESPERADO: Dentro de un segundo serán las
	 * 13:45:33
	 * 
	 * ENTRADA: 12 56 59 | RESULTADO ESPERADO: Dentro de un segundo serán las
	 * 12:57:00
	 * 
	 * ENTRADA: 7 59 59 | RESULTADO ESPERADO: Dentro de un segundo serán las 8:00:00
	 * 
	 * ENTRADA: 23 59 59 | RESULTADO ESPERADO: Dentro de un segundo serán las
	 * 0:00:00
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		int horas = -1;
		int minutos = -1;
		int segundos = -1;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Hora mas un segundo");
		System.out.println("-------------------");

		do {
			try {

				// Le pedimos al usuario el número de las horas y lo leemos
				System.out.println("Introduzca el número correspondiente a las horas (de 0 a 23)");
				horas = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (horas < 0 || horas > 23);

		do {
			try {

				// Le pedimos al usuario el número de los minutos y lo leemos
				System.out.println("Introduzca el número correspondiente a los minutos (de 0 a 59)");
				minutos = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto (de 0 a 59)");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (minutos < 0 || minutos > 59);

		do {
			try {

				// Le pedimos al usuario el número de los segundos y lo leemos
				System.out.println("Introduzca el número correspondiente a los segundos (de 0 a 59)");
				segundos = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (segundos < 0 || segundos > 59);

		// Calculamos la hora que será un segundo después
		if (segundos == 59) {
			segundos = 0;
			minutos++;
		} else
			segundos++;
		if (minutos == 60) {
			minutos = 0;
			horas++;
		}
		if (horas == 24)
			horas = 0;

		// Mostramos el resultado
		System.out.print("Dentro de un segundo serán las ");
		if (minutos < 10 && segundos < 10)
			System.out.println(horas + ":0" + minutos + ":0" + segundos);
		else {
			if (minutos < 10)
				System.out.println(horas + ":0" + minutos + ":" + segundos);
			else if (segundos < 10)
				System.out.println(horas + ":" + minutos + ":0" + segundos);
			else
				System.out.println(horas + ":" + minutos + ":" + segundos);
		}

		// Cerramos el Scanner
		sc.close();
	}
}
