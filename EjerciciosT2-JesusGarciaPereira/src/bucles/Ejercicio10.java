package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num;
		int numInverso = 0;
		int resto;
		int numAuxiliar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Capicúa");
		System.out.println("Introduzca un número mayor que 0");
		num = sc.nextInt();
		numAuxiliar = num;
		while (numAuxiliar > 0) {
			resto = numAuxiliar % 10;
			numInverso = numInverso * 10 + resto;
			numAuxiliar = numAuxiliar / 10;

		}
		if (num == numInverso)
			System.out.println("Es capicúa");
		else
			System.out.println("No es capicúa");
		sc.close();
	}

}
