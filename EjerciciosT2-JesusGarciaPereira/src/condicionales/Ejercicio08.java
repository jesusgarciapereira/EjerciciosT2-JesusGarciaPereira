package condicionales;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {

	// Pedimos al usuario:
	// 1 - Número correspondiente a los kilometros
	// 2 - Número correspondiente a los días

	// ENTRADA: Muchos | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: 234,6 | RESULTADO ESPERADO: El dato introducido no es correcto
	/*
	 * ENTRADA: 0 | RESULTADO ESPERADO: Dato incorrecto, sólo validos números
	 * mayores que 0
	 * 
	 * ENTRADA: 100 unos cuantos | RESULTADO ESPERADO: El dato introducido no es
	 * correcto
	 * 
	 * ENTRADA: 100 -3 | RESULTADO ESPERADO: Dato incorrecto, sólo validos números
	 * desde el 0
	 * 
	 * ENTRADA: 100 5 | RESULTADO ESPERADO: El precio total sería de 250.0€
	 *
	 * ENTRADA: 100 8 | RESULTADO ESPERADO: El precio total sería de 250.0€, pero en
	 * este caso aplicaríamos un descuento del 30% (75.0€) y el precio final se
	 * quedaría en 175.0€
	 * 
	 * ENTRADA: 50 10 | RESULTADO ESPERADO: El precio total sería de 125.0€, pero en
	 * este caso aplicaríamos un descuento del 30% (37.5€) y el precio final se
	 * quedaría en 87.5€
	 */

	public static void main(String[] args) {
		// Declaramos las constantes
		final double PRECIO_POR_KILOMETRO = 2.5;
		final int POR_CIENTO_DESCUENTO = 30;
		/*
		 * Declaramos la variables de la distancia y los días que le pediremos al
		 * usuario
		 */
		double distancia = 0.0;
		int dias;
		// Declaramos las variables de los precios que mostraremos
		double precioSinDescuento, precioConDescuento;
		/*
		 * Declaramos dos variables boolean diferentes para determinar si cada uno de
		 * los datos han sido introducidos correctamente
		 */
		boolean distanciaCorrecto = false;
		boolean diasCorrecto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para poder escribir en la consola decimales con punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Precio de un billete de tren");
		do {
			try {
				// Le pedimos al usuario la distancia
				System.out.println(
						"Indique la distancia del trayecto en km (si tiene decimales, use un punto como en el ejemplo 50.5)");
				// Leemos el número
				distancia = sc.nextDouble();
				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (distancia <= 0) {
					System.out.println("Dato incorrecto, sólo validos números mayores que 0");
					System.out.println("Introduzca otro número");
					distancia = sc.nextDouble();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de distanciaCorrecto seguirá siendo false.
				 * Por el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				distanciaCorrecto = true;
				// Si he introducido un dato incorrecto...
							} catch (InputMismatchException e) {
								// ... se mostrará el siguiente resultado
								System.out.println("El dato introducido no es correcto");
								// Para evitar un bucle infinito
								sc.nextLine();
							}
						} while (distanciaCorrecto == false); /*
															 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca
															 * el dato correctamente
															 */
		do {
			try {
				// Le pedimos al usuario los días
				System.out.println("Indique el número de días de instancia");
				// Leemos el número
				dias = sc.nextInt();
				/*
				 * Si el número se sale del margen le indicamos el error y pediremos otro todas
				 * las veces necesarias hasta que introduzca un número correcto
				 */
				while (dias < 0) {
					System.out.println("Dato incorrecto, sólo validos números desde el 0");
					System.out.println("Introduzca otro número");
					dias = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de diasCorrecto seguirá siendo false. Por
				 * el contrario se asignará como true y se ejecutarán las instrucciones
				 * siguientes
				 */
				diasCorrecto = true;
				// Establecemos la relación de las variables
				precioSinDescuento = distancia * PRECIO_POR_KILOMETRO;
				// Mostramos la primera parte del resultado
				System.out.print("El precio total sería de " + precioSinDescuento + "€");
				// Si la distancia es superior a 800 o el número de días de instancia supera 7
				if (distancia > 800 || dias > 7) {
					// ...establecemos esta relación de las variables...
					precioConDescuento = precioSinDescuento - (precioSinDescuento * POR_CIENTO_DESCUENTO / 100);
					// ... y mostramos el precio con el descuento
					System.out.println(", pero en este caso aplicaríamos un descuento del " + POR_CIENTO_DESCUENTO
							+ "% (" + precioSinDescuento * POR_CIENTO_DESCUENTO / 100
							+ "€) y el precio final se quedaría en " + precioConDescuento + "€");
				}
				// Si he introducido un dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}
		} while (diasCorrecto == false); /*
											 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca
											 * el dato correctamente
											 */
		// Cerramos el Scanner
		sc.close();
	}
}
