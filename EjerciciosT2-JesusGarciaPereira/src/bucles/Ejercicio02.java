package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int n;
		int contadorPrimos = 0;
		boolean esPrimo;
		boolean correcto = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de números primos entre 1 y n");
		do {
			try {
				System.out.println("Introduzca un valor para n");
				n = sc.nextInt();
				correcto = true;
				while (n < 1) {
					System.out.println("Número incorrecto, sólo válidos a partir del 1");
					System.out.println("Introduzca otro número");
					n = sc.nextInt();
				}
				for (int i = 2; i <= n; i++) {
					esPrimo = true;
					for (int j = 2; j <= Math.sqrt(i); j++) {
						if (i % j == 0) {
							esPrimo = false;
							break;
						}
					}
					if (esPrimo)
						contadorPrimos++;
				}
				System.out.println("Entre el 1 y el " + n + " hay " + contadorPrimos + " número(s) primo(s)");
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
			}
		} while (correcto == false);
		sc.close();
	}
}
