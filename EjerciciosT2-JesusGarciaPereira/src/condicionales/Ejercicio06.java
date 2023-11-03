package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
	/*
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
		System.out.println("Introduzca la solución");
		suma = sc.nextInt();
		if (suma == aleatorio1 + aleatorio2)
			System.out.print("¡Correcto! ");
		else
			System.out.print("Lo siento, la solución es ");
		System.out.println(aleatorio1 + " + " + aleatorio2 + " = " + (aleatorio1 + aleatorio2));
		sc.close();
	}
}
