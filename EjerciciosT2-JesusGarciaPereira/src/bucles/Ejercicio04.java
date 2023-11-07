package bucles;


import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Máximo común divisor de a y b");
		System.out.println("Introduzca un valor para a");
		a = sc.nextInt();
		System.out.println("Introduzca un valor para b");
		b = sc.nextInt();
		for (int i = a; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println("m.c.d.(" + a + "," + b + ") = " + i);
				break;
			}
		}
		sc.close();
	}

}
