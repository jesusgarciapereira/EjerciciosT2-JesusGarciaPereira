package condicionales;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {

	/*
	 * SALIDA: 77 + 34 = ¿? | ENTRADA: 11.1 | RESULTADO ESPERADO: El dato
	 * introducido no es del tipo correcto
	 * 
	 * SALIDA: 41 + 27 = ¿? | ENTRADA: sesenta y ocho | RESULTADO ESPERADO: El dato
	 * introducido no es del tipo correcto
	 * 
	 * SALIDA: 58 + 28 = ¿? | ENTRADA: 86 | RESULTADO ESPERADO: ¡Correcto! 58 + 28 =
	 * 86
	 * 
	 * SALIDA: 54 + 96 = ¿? | ENTRADA: 100 | RESULTADO ESPERADO: Lo siento, la
	 * solución es 54 + 96 = 150
	 */

	public static void main(String[] args) {

		// Declaramos las variables
		int aleatorio1, aleatorio2;
		int suma = 0;
		boolean correcto = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Juego de la suma");
		System.out.println("----------------");
		System.out.println("Mostraré dos números aleatorios e introducirás el valor de la suma");
		System.out.println("Pulsa INTRO para empezar");
		sc.nextLine();

		// Creamos un objeto de tipo Random
		Random r = new Random();

		// Generamos dos números aleatorios en el rango [1, 99] y los mostramos

		aleatorio1 = r.nextInt(1, 100);
		aleatorio2 = r.nextInt(1, 100);
		System.out.println(aleatorio1 + " + " + aleatorio2 + " = ¿?");

		do {
			try {

				// Le pedimos al usuario la solución y la leemos
				System.out.println("Introduzca la solución");
				suma = sc.nextInt();

				// Asignamos este dato como correcto
				correcto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!correcto);

		// Mostramos el resultado
		System.out.print(suma == aleatorio1 + aleatorio2 ? "¡Correcto! " : "Lo siento, la solución es ");
		System.out.println(aleatorio1 + " + " + aleatorio2 + " = " + (aleatorio1 + aleatorio2));

		// Cerramos el Scanner
		sc.close();
	}
}
