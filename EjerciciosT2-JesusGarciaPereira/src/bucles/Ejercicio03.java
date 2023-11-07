package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Triángulo de base y altura n");
		System.out.println("Introduzca un valor para n");
		n = sc.nextInt();
		System.out.println("He aquí un triángulo de base y altura " + n);
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
