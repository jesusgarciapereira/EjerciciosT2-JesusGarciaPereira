package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Números desde 1 hasta n n-veces");
		System.out.println("Introduzca un valor para n");
		n = sc.nextInt();
		while (n < 0 || n > 20) {
			System.out.println("Número incorrecto, sólo validos desde el 0 hasta el 20");
			System.out.println("Introduzca otro número");
			n = sc.nextInt();
		}
		//filas
		for (int i = 1; i <= n; i++) {
			//columnas
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		// Si el valor de n es 0...
		if (n == 0)
			// .. mostraremos el siguiente mensaje
			System.out.println("Con n asignado a " + n + " no hay nada que mostrar");
		sc.close();
	}
}
