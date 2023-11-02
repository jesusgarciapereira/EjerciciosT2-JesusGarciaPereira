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
		int aleatorio1, aleatorio2;
		int suma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Juego de la suma");
		System.out.println("Mostraré dos números aleatorios e introducirás el valor de la suma");
		System.out.println("Pulsa INTRO para empezar");
		sc.nextLine();
		Random r = new Random();
		aleatorio1 = r.nextInt(1, 100);
		aleatorio2 = r.nextInt(1, 100);
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
