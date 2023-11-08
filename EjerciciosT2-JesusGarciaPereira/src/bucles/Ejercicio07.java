package bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pirámide de números de n filas");
		System.out.println("Introduzca un valor para n");
		n = sc.nextInt();
		while (n < 0) {
			System.out.println("Número incorrecto, sólo válidos a partir del 0");
			System.out.println("Introduzca otro número");
			n = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
