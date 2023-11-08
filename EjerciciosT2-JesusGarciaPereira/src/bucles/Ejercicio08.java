package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int numInicial, otroNum;
		int contIntroducidos = 0;
		int contFallos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lectura mayores");
		System.out.print("Dime un número inicial: ");
		numInicial = sc.nextInt();
		contIntroducidos++;
		do {
			System.out.print("Dime un número: ");
			otroNum = sc.nextInt();
			if (otroNum != 0) {
				contIntroducidos++;
				if (otroNum <= numInicial) {
					contFallos++;
					if (otroNum < numInicial)
						System.out.println("Fallo, es menor.");
					else
						System.out.println("Fallo, es igual.");
				}
			}
		} while (otroNum != 0);

		System.out.println("Total números introducidos: " + contIntroducidos);
		System.out.println("Números fallados: " + contFallos);
		sc.close();
	}

}
