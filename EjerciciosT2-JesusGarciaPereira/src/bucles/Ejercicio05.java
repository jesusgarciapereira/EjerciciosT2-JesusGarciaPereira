package bucles;


import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mínimo común múltiplo de a y b");
		System.out.println("Introduzca un valor para a");
		a = sc.nextInt();
		System.out.println("Introduzca un valor para b");
		b = sc.nextInt();
		for (int i = a;;i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println("m.c.m.(" + a + "," + b + ") = " + i);
				break;
			}
		}
		sc.close();
	}

}

