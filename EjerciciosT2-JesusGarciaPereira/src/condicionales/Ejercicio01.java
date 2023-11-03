package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	/*
	 * ENTRADA: -1 | RESULTADO ESPERADO: Número incorrecto, sólo validos desde el 0
	 * hasta el 9999
	 */
	// ENTRADA: 1 | RESULTADO ESPERADO: El número 1 es capicúa
	// ENTRADA: 33 | RESULTADO ESPERADO: El número 33 es capicúa
	// ENTRADA: 45 | RESULTADO ESPERADO: El número 45 no es capicúa
	// ENTRADA: 464 | RESULTADO ESPERADO: El número 464 es capicúa
	// ENTRADA: 478 | RESULTADO ESPERADO: El número 478 no es capicúa
	// ENTRADA: 3553 | RESULTADO ESPERADO: El número 3553 es capicúa
	// ENTRADA: 4564 | RESULTADO ESPERADO: El número 4564 no es capicúa
	/*
	 * ENTRADA: 10000 | RESULTADO ESPERADO: Número incorrecto, sólo validos desde el
	 * 0 hasta el 9999
	 */

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos una variable boolean para determinar si un número es capicua
		boolean esCapicua = false;
		/*
		 * Declaramos una variable boolean para determinar si un dato ha sido
		 * introducido correctamente
		 */
		boolean correcto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Capicúa");
		do {
			try {
				// Le pedimos al usuario un número
				System.out.println("Introduzca un número entre 0 y 9999, analizaré si es capicúa o no");
				// Leemos el número
				num = sc.nextInt();
				/*
				 * Si he introducido un dato incorrecto se ejecutará directamente el catch y el
				 * valor de correcto seguirá siendo false. Por el contrario se asignará como
				 * true
				 */
				correcto = true;
				/*
				 * Si el número se sale de los márgenes le indicamos el error y pediremos otro
				 * todas las veces necesarias hasta que introduzca un número correcto
				 */
				while (num < 0 || num > 9999) {
					System.out.println("Número incorrecto, sólo validos desde el 0 hasta el 9999");
					System.out.println("Introduzca otro número");
					num = sc.nextInt();
				}
				// Si el número sólo tiene una cifra...
				if (num < 10)
					// ... siempre es capicúa
					esCapicua = true;
				// Si el número tiene dos cifras...
				else if (num >= 10 && num < 100)
					// ... el valor de esCapicua dependerá de si la decena y la unidad son iguales
					esCapicua = num / 10 == num % 10;
				// Si el número tiene tres cifras...
				else if (num >= 100 && num < 1000)
					// ... el valor de esCapicua dependerá de si la centena y la unidad son iguales
					esCapicua = num / 100 == num % 10;
				// Si el número tiene cuatro cifras...
				else
					/*
					 * ... el valor de esCapicua dependerá de si tanto la unidad de millar como la
					 * unidad son iguales entre sí, y si la centena y la decena son iguales entre sí
					 */
					esCapicua = num / 1000 == num % 10 && num / 100 % 10 == num / 10 % 10;
				// Mostramos la primera parte del resultado
				System.out.print("El número " + num);
				// Si el valor de capicuaEs es true, mostrará que lo es
				if (esCapicua)
					System.out.println(" es capicúa");
				// En caso contrario, mostrará que no lo es
				else
					System.out.println(" no es capicúa");
				// Si he introducido un dato incorrecto, se ejecutarán estas instrucciones
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}
		} while (correcto == false);	 /*
										 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca un
										 * dato correcrto
										 */
		// Cerramos el Scanner
		sc.close();
	}
}
