package condicionales;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio08 {

	// Pedimos al usuario:
	// 1 - Número correspondiente a los kilometros
	// 2 - Número correspondiente a los días

	/*
	 * ENTRADA: Muchos | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 * 
	 * ENTRADA: 234,6 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 *
	 * ENTRADA: 0 | RESULTADO ESPERADO: Indique la distancia del trayecto en km
	 * (mayor que 0)
	 * 
	 * ENTRADA: 100 unos cuantos | RESULTADO ESPERADO: El dato introducido no es
	 * correcto
	 * 
	 * ENTRADA: 100 -3 | RESULTADO ESPERADO: Indique el número de días de instancia
	 * (a partir de 0)
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

		// Declaramos las variables
		double distancia = 0.0;
		int dias = -1;
		double precioSinDescuento, precioConDescuento;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Presentamos el programa
		System.out.println("Precio de un billete de tren");
		System.out.println("----------------------------");

		do {
			try {

				// Le pedimos al usuario la distancia y la leemos
				System.out.println("Indique la distancia del trayecto en km (mayor que 0)");
				System.out.println("(si tiene decimales, use un punto como en el ejemplo 50.5)");
				distancia = sc.nextDouble();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (distancia <= 0);

		do {
			try {

				// Le pedimos al usuario el número de días y lo leemos
				System.out.println("Indique el número de días de instancia (a partir de 0)");
				dias = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (dias < 0);

		// Calculamos el precio sin descuento
		precioSinDescuento = distancia * PRECIO_POR_KILOMETRO;

		// Mostramos el resultado
		System.out.print("El precio total sería de " + precioSinDescuento + "€");

		// Calculamos y mostramos el precio con descuento si se cumple la condición
		if (distancia > 800 || dias > 7) {

			precioConDescuento = precioSinDescuento - (precioSinDescuento * POR_CIENTO_DESCUENTO / 100);

			System.out.println(", pero en este caso aplicaríamos un descuento del " + POR_CIENTO_DESCUENTO + "% ("
					+ precioSinDescuento * POR_CIENTO_DESCUENTO / 100 + "€) y el precio final se quedaría en "
					+ precioConDescuento + "€");
		}

		// Cerramos el Scanner
		sc.close();
	}
}
