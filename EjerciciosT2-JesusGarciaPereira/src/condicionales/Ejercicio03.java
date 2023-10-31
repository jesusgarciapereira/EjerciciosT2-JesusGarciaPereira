package condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int numAnimales;
		double comidaComprada, kilosComidosTotal, kilosComidosPorAnimal;
		boolean hayComida;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Granja");
		System.out.println(
				"Introduzca la cantidad de comida comprada hoy (en kg y, si tiene decimales, use un punto como en el ejemplo 100.5)");
		comidaComprada = sc.nextDouble();
		while (comidaComprada < 0) {
			System.out.println("Dato incorrecto, sólo validos números desde el 0");
			System.out.println("Introduzca otro número");
			comidaComprada = sc.nextDouble();
		}
		System.out.println("Introduzca el número de animales que hay en la granja");
		numAnimales = sc.nextInt();
		while (numAnimales < 0) {
			System.out.println("Dato incorrecto, sólo validos números desde el 0");
			System.out.println("Introduzca otro número");
			numAnimales = sc.nextInt();
		}
		System.out.println(
				"Introduzca los kilos de comida que comen todos los animales a diario (si tiene decimales, recuerde usar un punto)");
		kilosComidosTotal = sc.nextDouble();
		while (kilosComidosTotal <= 0) {
			System.out.println("Dato incorrecto, sólo validos números mayores que 0");
			System.out.println("Introduzca otro número");
			kilosComidosTotal = sc.nextDouble();
		}
		if (comidaComprada >= kilosComidosTotal || numAnimales == 0)
			hayComida = true;
		else
			hayComida = false;
		if (numAnimales == 0)
			System.out.println("No hay animales en la granja que consuman la comida comprada hoy");
		else {
			if (hayComida)
				System.out.println("Hoy disponemos de suficiente alimento para cada animal");
			else {
				if (comidaComprada == 0)
					System.out.println("Hoy los animales no tienen nada que comer");
				else {
					kilosComidosPorAnimal = comidaComprada / numAnimales;
					System.out.println("Hoy sería necesario racionarla a " + kilosComidosPorAnimal + " kg por animal");
				}
			}
		}
		sc.close();

	}

}
