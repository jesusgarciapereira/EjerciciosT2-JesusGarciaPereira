package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int num;
		int contCifras =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de dígitos");
		System.out.println("Introduzca un número mayor que 0");
		num = sc.nextInt();
		while(num!=0) {
			num = num /10;
			contCifras++;
		}
			System.out.println(contCifras);
			sc.close();
		}
	
}


