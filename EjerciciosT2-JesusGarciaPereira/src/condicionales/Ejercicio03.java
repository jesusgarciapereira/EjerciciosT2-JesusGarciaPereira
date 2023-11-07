package condicionales;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

// Pedimos al usuario: 
	// 1 - Cantidad de comida comprada
	// 2 - Número de animales en la granja
	// 3 - Cantidad de comida que comen los animales

	/*
	 * ENTRADA: 100,5 | RESULTADO ESPERADO: El dato introducido no es correcto
	 *
	 * ENTRADA: 100 Una vaca | RESULTADO ESPERADO: El dato introducido no es
	 * correcto
	 *
	 * ENTRADA: 100 3 Comen mucho | RESULTADO ESPERADO: El dato introducido no es
	 * correcto
	 *
	 * ENTRADA: -1 | RESULTADO ESPERADO: Dato incorrecto, sólo validos números desde
	 * el 0
	 * 
	 * ENTRADA: 100 -1 | RESULTADO ESPERADO: Dato incorrecto, sólo validos números
	 * desde el 0
	 * 
	 * ENTRADA: 100 10 0 | RESULTADO ESPERADO: Dato incorrecto, sólo validos números
	 * mayores que 0
	 * 
	 * ENTRADA: 100 0 50 | RESULTADO ESPERADO: No hay animales en la granja que
	 * consuman la comida comprada
	 * 
	 * ENTRADA: 0 0 50 | RESULTADO ESPERADO: No hay animales en la granja que
	 * consuman la comida comprada
	 * 
	 * ENTRADA: 100 10 50 | RESULTADO ESPERADO: Hoy disponemos de suficiente
	 * alimento para cada animal
	 * 
	 * ENTRADA: 0 10 50 | RESULTADO ESPERADO: Hoy los animales no tienen nada que
	 * comer
	 * 
	 * ENTRADA: 50 10 100 | RESULTADO ESPERADO: Hoy sería necesario racionarla a 5.0
	 * kg por animal
	 */

	public static void main(String[] args) {
		/*
		 * Declaramos las variables del número de animales, comida comprada y kilos
		 * comidos en total que le pediremos al usuario
		 */
		int numAnimales = 0;
		double comidaComprada = 0.0;
		double kilosComidosTotal;
		// Declaramos la variable de kilos comidos por animal que mostraremos
		double kilosComidosPorAnimal;
		// Declaramos una variable boolean para determinar si hay comida
		boolean hayComida;
		/*
		 * Declaramos tres variables boolean diferentes para determinar si cada uno de
		 * los datos han sido introducidos correctamente
		 */
		boolean compradoCorrecto = false;
		boolean animalCorrecto = false;
		boolean kilosComidosCorrecto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Granja");
		do {
			try {
				// Le pedimos al usuario la cantidad de comida comprada
				System.out.println(
						"Introduzca la cantidad de comida comprada hoy (en kg y, si tiene decimales, use un punto como en el ejemplo 100.5)");
				// Leemos el número
				comidaComprada = sc.nextDouble();
				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (comidaComprada < 0) {
					System.out.println("Dato incorrecto, sólo validos números desde el 0");
					System.out.println("Introduzca otro número");
					comidaComprada = sc.nextDouble();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de compradoCorrecto seguirá siendo false.
				 * Por el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				compradoCorrecto = true;
				// Si he introducido algún dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}
		} while (compradoCorrecto == false); /*
												 * Se ejecutarán de nuevo las instrucciones del do, hasta que se
												 * introduzca el dato correctamente
												 */
		do {
			try {
				// Le pedimos al usuario el número de animales
				System.out.println("Introduzca el número de animales que hay en la granja");
				// Leemos el número
				numAnimales = sc.nextInt();

				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (numAnimales < 0) {
					System.out.println("Dato incorrecto, sólo validos números desde el 0");
					System.out.println("Introduzca otro número");
					numAnimales = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de animalCorrecto seguirá siendo false.
				 * Por el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				animalCorrecto = true;
				// Si he introducido algún dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}

		} while (animalCorrecto == false); /*
											 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca
											 * el dato correctamente
											 */

		do {
			try {
				// Le pedimos al usuario los kilos consumidos en total por los animales
				System.out.println(
						"Introduzca los kilos de comida que comen todos los animales a diario (si tiene decimales, recuerde usar un punto)");
				// Leemos el número
				kilosComidosTotal = sc.nextDouble();
				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (kilosComidosTotal <= 0) {
					System.out.println("Dato incorrecto, sólo validos números mayores que 0");
					System.out.println("Introduzca otro número");
					kilosComidosTotal = sc.nextDouble();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de kilosComidosCorrecto seguirá siendo
				 * false. Por el contrario se asignará como true y se ejecutarán las
				 * instrucciones siguientes
				 */
				kilosComidosCorrecto = true;
				/*
				 * Si la cantidad de comida comprada es igual o superior a la consumida por los
				 * animales, el valor de hayComida es true; por el contrario, será false
				 */
				hayComida = (comidaComprada >= kilosComidosTotal) ? true : false;
				// Si el número de animales es 0, mostraremos el siguiente mensaje
				if (numAnimales == 0)
					System.out.println("No hay animales en la granja que consuman la comida comprada");
				// En caso contrario...
				else {
					// ... y, si el valor de hayComida es true, mostraremos el siguiente mensaje
					if (hayComida)
						System.out.println("Hoy disponemos de suficiente alimento para cada animal");
					else { // ... y, si el valor de hayComida es false...
							// ... y el valor de comidaComprada es 0, mostraremos el siguiente mensaje
						if (comidaComprada == 0)
							System.out.println("Hoy los animales no tienen nada que comer");
						else { // ... y el valor de comidaComprada no es 0
								// Establecemos la relación entre las variables
							kilosComidosPorAnimal = comidaComprada / numAnimales;
							// Y mostraremos el siguiente resultado
							System.out.println(
									"Hoy sería necesario racionarla a " + kilosComidosPorAnimal + " kg por animal");
						}
					}
				}
				// Si he introducido algún dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}

		} while (kilosComidosCorrecto == false); /*
													 * Se ejecutarán de nuevo las instrucciones del do, hasta que se
													 * introduzca el dato correctamente
													 */
// Cerramos el Scanner
		sc.close();
	}
}