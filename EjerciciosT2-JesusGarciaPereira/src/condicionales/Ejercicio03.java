package condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// (cantidad de comida comprada, número de animales y kilos de comida que comen
		// todos los animales en total)
		int numAnimales;
		double comidaComprada, kilosComidosTotal;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Granja");
		System.out.println("Introduzca la cantidad de comida comprada (en kg y, si tiene decimales, use un punto como en el ejemplo 100.5)");
		comidaComprada = sc.nextDouble();
		System.out.println("Introduzca el número de animales que hay en la granja");
		numAnimales = sc.nextInt();
		System.out.println("Introduzca los kilos de comida que comen todos los animales a diario (si tiene decimales, recuerde usar un punto");
		kilosComidosTotal = sc.nextDouble();

	}

}
