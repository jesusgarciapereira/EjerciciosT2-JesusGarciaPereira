package condicionales;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	
	/*
	 * SALIDA: 77 + 34 = ¿? | ENTRADA: 11.1 | RESULTADO ESPERADO: El dato
	 * introducido no es válido
	 * 
	 * SALIDA: 41 + 27 = ¿? | ENTRADA: sesenta y ocho | RESULTADO ESPERADO: El dato
	 * introducido no es válido
	 * 
	 * SALIDA: 58 + 28 = ¿? | ENTRADA: 86 | RESULTADO ESPERADO: ¡Correcto! 58 + 28 =
	 * 86
	 * 
	 * SALIDA: 54 + 96 = ¿? | ENTRADA: 100 | RESULTADO ESPERADO: Lo siento, la
	 * solución es 54 + 96 = 150
	 */
	
	public static void main(String[] args) {
		// Declaramos las variables de los números aleatorios que generará el programa
		int aleatorio1, aleatorio2;
		// Declaramos la variable de la suma que le pediremos al usuario
		int suma;
		/*
		 * Declaramos una variable boolean para determinar si un dato introducido es
		 * valido
		 */
		boolean valido = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Juego de la suma");
		System.out.println("Mostraré dos números aleatorios e introducirás el valor de la suma");
		System.out.println("Pulsa INTRO para empezar");
		sc.nextLine();
		// Creamos un objeto de tipo Random
		Random r = new Random();
		/*
		 * Asisnamos a cada una de estas variables un número entero aleatorio del 1 al
		 * 99
		 */
		aleatorio1 = r.nextInt(1, 100);
		aleatorio2 = r.nextInt(1, 100);
		// Mostramos las dos variables
		System.out.println(aleatorio1 + " + " + aleatorio2 + " = ¿?");
		do {
			try {
				// Le pedimos al usuario la solución
				System.out.println("Introduzca la solución");
				// Leemos el número
				suma = sc.nextInt();
				/*
				 * Si he introducido un dato invalido se ejecutarán directamente las
				 * instrucciones del catch y el valor de valido seguirá siendo false. Por el
				 * contrario se asignará como true y se ejecutarán las instrucciones siguientes
				 */
				valido = true;
				// Si es correcto...
				if (suma == aleatorio1 + aleatorio2)
					// ... mostrará este mensaje
					System.out.print("¡Correcto! ");
				// En caso contrario...
				else
					// ... mostrará este otro mensaje
					System.out.print("Lo siento, la solución es ");
				// En cualquier caso, siempre mostrará la solución real a continuación
				System.out.println(aleatorio1 + " + " + aleatorio2 + " = " + (aleatorio1 + aleatorio2));
				// Si he introducido un dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
				sc.nextLine();
			}
		} while (valido == false); /*
									 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca un
									 * dato valido
									 */
		// Cerramos el Scanner
		sc.close();
	}
}
