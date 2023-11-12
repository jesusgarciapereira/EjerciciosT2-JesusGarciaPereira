package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	// Pedimos al usuario:
	// 1 - Número correspondiente a las horas
	// 2 - Número correspondiente a los minutos
	// 3 - Número correspondiente a los segundos
	// 4 - Cantidad de segundos a incrementar

	/*
	 * ENTRADA: hora | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: 5.9 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
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
	 * ENTRADA: 7 34 3 -1 | RESULTADO ESPERADO: Introduzca la cantidad de segundos a
	 * incrementar (a partir de 0)
	 * 
	 * ENTRADA: 13 5 32 0 | RESULTADO ESPERADO: Dentro de 0 segundo(s) serán las
	 * 13:05:32
	 * 
	 * ENTRADA: 5 57 54 15 | RESULTADO ESPERADO: Dentro de 15 segundo(s) serán las
	 * 5:58:09
	 * 
	 * ENTRADA: 23 59 56 7| RESULTADO ESPERADO: Dentro de 7 segundo(s) serán las
	 * 0:00:03
	 */
	
	public static void main(String[] args) {

		// Declaramos las variables
		int horas = -1;
		int minutos = -1;
		int segundos = -1;
		int segundosIncrementados = -1;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Hora mas n segundos");
		System.out.println("-------------------");

		do {
			try {

				// Le pedimos al usuario el número de las horas y lo leemos
				System.out.println("Introduzca el número correspondiente a las horas (de 0 a 23)");
				horas = sc.nextInt();

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner */
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

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (minutos < 0 || minutos > 59);

		do {
			try {

				// Le pedimos al usuario el número de los segundos y lo leemos
				System.out.println("Introduzca el número correspondiente a los segundos (de 0 a 59)");
				segundos = sc.nextInt();

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (segundos < 0 || segundos > 59);

		do {
			try {

				// Le pedimos al usuario la cantidad segundos a incrementar y la leemos
				System.out.println("Introduzca la cantidad de segundos a incrementar (a partir de 0)");
				segundosIncrementados = sc.nextInt();

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (segundosIncrementados < 0);

		// Bucle for para calcular la hora después de incrementar los segundos
		for (int i = 1; i <= segundosIncrementados; i++) {
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
		}

		// Mostramos el resultado
		System.out.print("Dentro de " + segundosIncrementados + " segundo(s) serán las ");
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
