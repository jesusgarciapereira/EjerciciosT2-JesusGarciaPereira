package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num;
		boolean capicuaEs = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Capicúa");
		//¿Dónde poner el while?
		System.out.println("Introduzca un número entre 0 y 9999 y analizaré si es capicúa o no");
		num = sc.nextInt();
		while (num < 0 || num > 9999) {
			System.out.println("Número incorrecto, sólo validos desde el 0 hasta el 9999");
			System.out.println("Introduzca otro número");
			num = sc.nextInt();
		}
		//¿Todo en un solo if?
		if (num < 10)
			capicuaEs = true;
		else if (num >= 10 && num < 100 && num / 10 == num % 10)
			capicuaEs = true;
		else if (num >= 100 && num < 1000 && num / 100 == num % 100 % 10)
			capicuaEs = true;
		else if (num >= 1000 && num < 10000 && num / 1000 == num % 1000 % 100 % 10 && num / 100 % 10 == num % 100 / 10)
			capicuaEs = true;

		System.out.print("El número " + num);
		if (capicuaEs == true)
			System.out.println(" es capicúa");
		else
			System.out.println(" no es capicúa");

		sc.close();
	}
}
