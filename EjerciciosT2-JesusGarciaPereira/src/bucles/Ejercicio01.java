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
	 * ENTRADA: -1 | RESULTADO ESPERADO: Número incorrecto, para las horas sólo son
	 * validos números desde el 0 hasta el 23
	 * 
	 * ENTRADA: 22 89 | RESULTADO ESPERADO: Número incorrecto, para los minutos sólo
	 * son validos números desde el 0 hasta el 59
	 * 
	 * ENTRADA: 14 59 70 | RESULTADO ESPERADO: Número incorrecto, para los segundos
	 * sólo son validos números desde el 0 hasta el 59
	 *
	 * ENTRADA: 7 34 3 -1 | RESULTADO ESPERADO: Número incorrecto, sólo valores
	 * desde el 0
	 * 
	 * ENTRADA: 13 5 32 0 | RESULTADO ESPERADO: Dentro de 0 segundos serán las
	 * 13:05:32
	 * 
	 * ENTRADA: 5 57 54 15 | RESULTADO ESPERADO: Dentro de 15 segundos serán las
	 * 5:58:09
	 * 
	 * ENTRADA: 23 59 56 7| RESULTADO ESPERADO: Dentro de 7 segundos serán las
	 * 0:00:03
	 */
	public static void main(String[] args) {

		// Declaramos las variables
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		int segundosIncrementados = 0;
		boolean horasCorrecto = false;
		boolean minutosCorrecto = false;
		boolean segundosCorrecto = false;
		boolean segundosIncrementadosCorrecto = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Hora mas n segundos");
		System.out.println("-------------------");

		do {
			try {

				// Le pedimos al usuario el número de las horas y lo leemos
				System.out.println("Introduzca el número correspondiente a las horas");
				horas = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (horas < 0 || horas > 23) {
					System.out.println(
							"Número incorrecto, para las horas sólo son validos números desde el 0 hasta el 23");
					System.out.println("Introduzca otro número");
					horas = sc.nextInt();
				}

				// Asignamos este dato como correcto
				horasCorrecto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!horasCorrecto);

		do {
			try {

				// Le pedimos al usuario el número de los minutos y lo leemos
				System.out.println("Introduzca el número correspondiente a los minutos");
				minutos = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (minutos < 0 || minutos > 59) {
					System.out.println(
							"Número incorrecto, para los minutos sólo son validos números desde el 0 hasta el 59");
					System.out.println("Introduzca otro número");
					minutos = sc.nextInt();
				}

				// Asignamos este dato como correcto
				minutosCorrecto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!minutosCorrecto);

		do {
			try {

				// Le pedimos al usuario el número de los segundos y lo leemos
				System.out.println("Introduzca el número correspondiente a los segundos");
				segundos = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (segundos < 0 || segundos > 59) {
					System.out.println(
							"Número incorrecto, para los segundos sólo son validos números desde el 0 hasta el 59");
					System.out.println("Introduzca otro número");
					segundos = sc.nextInt();
				}

				// Asignamos este dato como correcto
				segundosCorrecto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!segundosCorrecto);

		do {
			try {

				// Le pedimos al usuario la cantidad segundos a incrementar y la leemos
				System.out.println("Introduzca la cantidad de segundos a incrementar");
				segundosIncrementados = sc.nextInt();

				// Verificamos que la cantidad está dentro del rango válido
				while (segundosIncrementados < 0) {
					System.out.println("Número incorrecto, sólo valores desde el 0");
					System.out.println("Introduzca otro número");
					segundosIncrementados = sc.nextInt();
				}

				// Asignamos este dato como correcto
				segundosIncrementadosCorrecto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!segundosIncrementadosCorrecto);

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
		System.out.print("Dentro de " + segundosIncrementados + " segundos serán las ");
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
