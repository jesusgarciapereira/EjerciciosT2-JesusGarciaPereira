package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	// Pedimos al usuario:
	// 1 - Número correspondiente a las horas
	// 2 - Número correspondiente a los minutos
	// 3 - Número correspondiente a los segundos
	// 4 - Cantidad de segundos a incrementar

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
	 * ENTRADA: 13 5 32 20 | RESULTADO ESPERADO: Dentro de 20 segundos serán las
	 * 13:05:52
	 * 
	 * ENTRADA: 5 57 54 15 | RESULTADO ESPERADO: Dentro de 15 segundos serán las
	 * 5:58:09
	 * 
	 * ENTRADA: 23 59 56 | RESULTADO ESPERADO: Dentro de 7 segundos serán las
	 * 0:00:03
	 */
	public static void main(String[] args) {
		/*
		 * Declaramos la variables de las horas, minutos, segundos y los segundos
		 * incrementados que le pediremos al usuario
		 */
		int horas, minutos, segundos, segundosIncrementados;
		/*
		 * Declaramos tres variables boolean diferentes para determinar si cada uno de
		 * los datos han sido introducidos correctamente
		 */
		boolean horasCorrecto = false;
		boolean minutosCorrecto = false;
		boolean segundosCorrecto = false;
		boolean segundosIncrementadosCorrecto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Hora mas n segundos");
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
				// Le pedimos al usuario los segundos a incrementar
				System.out.println("Introduzca la cantidad de segundos a incrementar");
				// Leemos el número
				segundosIncrementados = sc.nextInt();
				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (segundosIncrementados < 0) {
					System.out.println("Número incorrecto, sólo valores mayores que 0");
					System.out.println("Introduzca otro número");
					segundosIncrementados = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de segundosIncrementadosCorrecto seguirá
				 * siendo false. Por el contrario se asignará como true y se ejecutarán las
				 * instrucciones siguientes
				 */
				segundosIncrementadosCorrecto = true;
				// Mostramos la primera parte del resultado
				System.out.print("Dentro de " + segundosIncrementados + " segundos serán las ");
				/*
				 * Bucle for que se ejecutará desde el 1 hasta valor asignado a
				 * segundosIncrementados
				 */
				for (int i = 1; i <= segundosIncrementados; i++) {
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
				}
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
		} while (horasCorrecto == false || minutosCorrecto == false || segundosCorrecto == false
				|| segundosIncrementadosCorrecto == false); /*
															 * Se ejecutarán de nuevo las instrucciones del do, hasta
															 * que se introduzcan todos los datos correctamente
															 */
		// Cerramos el Scanner
		sc.close();
	}

}
