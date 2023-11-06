package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

// Pedimos al usuario:
	// 1 - Número correspondiente a las horas
	// 2 - Número correspondiente a los minutos
	// 3 - Número correspondiente a los segundos

	// ENTRADA: hora | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: 5.9 | RESULTADO ESPERADO: El dato introducido no es correcto
	/*
	 * ENTRADA: -1 | RESULTADO ESPERADO: Número incorrecto, para las horas sólo son
	 * validos números desde el 0 hasta el 23
	 * 
	 * ENTRADA: 22 89 | RESULTADO ESPERADO: Número incorrecto, para los minutos sólo
	 * son validos números desde el 0 hasta el 59
	 * 
	 * ENTRADA: 14 59 70 | RESULTADO ESPERADO: Número incorrecto, para los segundos
	 * sólo son validos números desde el 0 hasta el 59
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
		/*
		 * Declaramos la variables de las horas, minutos y segundos que le pediremos al
		 * usuario
		 */
		int horas, minutos, segundos;
		/*
		 * Declaramos tres variables boolean diferentes para determinar si cada uno de
		 * los datos han sido introducidos correctamente
		 */
		boolean horasCorrecto = false;
		boolean minutosCorrecto = false;
		boolean segundosCorrecto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Hora mas un segundo");
		do {
			try {
				// Le pedimos al usuario las horas
				System.out.println("Introduzca el número correspondiente a las horas");
				// Leemos el número
				horas = sc.nextInt();
				/*
				 * Si el número se sale de los márgenes le indicamos el error y pediremos otro
				 * todas las veces necesarias hasta que introduzca un número correcto
				 */
				while (horas < 0 || horas > 23) {
					System.out.println(
							"Número incorrecto, para las horas sólo son validos números desde el 0 hasta el 23");
					System.out.println("Introduzca otro número");
					horas = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de horasCorrecto seguirá siendo false. Por
				 * el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				horasCorrecto = true;
				// Le pedimos al usuario los minutos
				System.out.println("Introduzca el número correspondiente a los minutos");
				// Leemos el número
				minutos = sc.nextInt();
				/*
				 * Si el número se sale de los márgenes le indicamos el error y pediremos otro
				 * todas las veces necesarias hasta que introduzca un número correcto
				 */
				while (minutos < 0 || minutos > 59) {
					System.out.println(
							"Número incorrecto, para los minutos sólo son validos números desde el 0 hasta el 59");
					System.out.println("Introduzca otro número");
					minutos = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de minutosCorrecto seguirá siendo false.
				 * Por el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				minutosCorrecto = true;
				// Le pedimos al usuario los segundos
				System.out.println("Introduzca el número correspondiente a los segundos");
				// Leemos el número
				segundos = sc.nextInt();
				/*
				 * Si el número se sale de los márgenes le indicamos el error y pediremos otro
				 * todas las veces necesarias hasta que introduzca un número correcto
				 */
				while (segundos < 0 || segundos > 59) {
					System.out.println(
							"Número incorrecto, para los segundos sólo son validos números desde el 0 hasta el 59");
					System.out.println("Introduzca otro número");
					segundos = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de segundosCorrecto seguirá siendo false.
				 * Por el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				segundosCorrecto = true;
				// Mostramos la primera parte del resultado
				System.out.print("Dentro de un segundo serán las ");
				// Si el valor de los segundos es 59...
				if (segundos == 59) {
					// ... asignaremos el valor 0 a los segundos e incrementamos los minutos en 1
					segundos = 0;
					minutos++;
				} else // Por el contrario incrementamos los segundos en 1
					segundos++;
				// Si el valor de los segundos es 60...
				if (minutos == 60) {
					// ... asignaremos el valor 0 a los minutos e incrementamos las horas en 1
					minutos = 0;
					horas++;
				}
				// Si el valor de las horas es 24...
				if (horas == 24)
					// ... le asignaremos el valor 0
					horas = 0;
				/*
				 * La segunda parte del resultado se mostrará añadiendo un 0 a la izquierda de
				 * los segundos y/o minutos en caso de que sus respectivos valores sean menores
				 * de 10
				 */
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
				// Si he introducido un dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}
		} while (horasCorrecto == false || minutosCorrecto == false
				|| segundosCorrecto == false); /*
												 * Se ejecutarán de nuevo las instrucciones del do, hasta que se
												 * introduzcan todos los datos correctamente
												 */
		// Cerramos el Scanner
		sc.close();
	}
}
