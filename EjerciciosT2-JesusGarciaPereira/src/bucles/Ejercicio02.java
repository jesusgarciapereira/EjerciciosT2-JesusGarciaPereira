package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int n;
		int contadorPrimos=0;
		boolean esPrimo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de números primos entre 1 y n");
		System.out.println("Introduzca un valor para n");
		n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			esPrimo = true;
			for (int j = 2; j < i; j++) {
				if (i % j ==0)
					esPrimo=false;
			}
			if (esPrimo)
				contadorPrimos++;
			
		}
		System.out.println(contadorPrimos);
		}
	}


