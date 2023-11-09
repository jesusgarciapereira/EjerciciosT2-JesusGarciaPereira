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
	 * ENTRADA: 100,5 | RESULTADO ESPERADO: El dato introducido no es del tipo
	 * correcto
	 *
	 * ENTRADA: 100 Una vaca | RESULTADO ESPERADO: El dato introducido no es del
	 * tipo correcto
	 *
	 * ENTRADA: 100 3 Comen mucho | RESULTADO ESPERADO: El dato introducido no es
	 * del tipo correcto
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

		// Declaramos las variables
		int numAnimales = 0;
		double comidaComprada = 0.0;
		double kilosComidosTotal = 0.0;
		double kilosComidosPorAnimal;
		boolean hayComida;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Presentamos el programa
		System.out.println("Granja");
		System.out.println("------");

		do {
			try {

				// Le pedimos al usuario la cantidad de comida comprada y la leemos
				System.out.println("Introduzca la cantidad de comida comprada hoy ");
				System.out.println("(en kg y, si tiene decimales, use un punto como en el ejemplo 100.5)");
				comidaComprada = sc.nextDouble();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (comidaComprada < 0);

		do {
			try {

				// Le pedimos al usuario el número de animales y lo leemos
				System.out.println("Introduzca el número de animales que hay en la granja");
				numAnimales = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (numAnimales < 0);

		do {
			try {
				/*
				 * Le pedimos al usuario los kilos consumidos en total por los animales y leemos
				 * el número
				 */
				System.out.println("Introduzca los kilos de comida que comen todos los animales a diario");
				System.out.println("(si tiene decimales, recuerde usar un punto)");
				kilosComidosTotal = sc.nextDouble();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número no esté dentro del rango, repetiremos las instrucciones
		} while (kilosComidosTotal <= 0);

		// Establecemos la relación entre estas variables

		hayComida = comidaComprada >= kilosComidosTotal ? true : false;

		// Mostramos el resultado
		if (numAnimales == 0)
			System.out.println("No hay animales en la granja que consuman la comida comprada");
		else {
			if (hayComida)
				System.out.println("Hoy disponemos de suficiente alimento para cada animal");
			else {
				if (comidaComprada == 0)
					System.out.println("Hoy los animales no tienen nada que comer");
				else {
					// Establecemos la relación entre estas variables
					kilosComidosPorAnimal = comidaComprada / numAnimales;
					System.out.println("Hoy sería necesario racionarla a " + kilosComidosPorAnimal + " kg por animal");
				}
			}
		}

		// Cerramos el Scanner
		sc.close();
	}
}