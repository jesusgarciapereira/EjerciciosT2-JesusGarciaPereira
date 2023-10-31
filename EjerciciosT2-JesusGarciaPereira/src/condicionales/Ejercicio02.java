package condicionales;

import java.util.Scanner;

public class Ejercicio02 {
	/*
	 * ENTRADA: 5687345 | RESULTADO ESPERADO: DNI incorrecto, sólo validos números
	 * de 8 cifras
	 */
	// ENTRADA: 77816487 | RESULTADO ESPERADO: Su NIF es: N
	/*
	 * ENTRADA: 100000000 | RESULTADO ESPERADO: DNI incorrecto, sólo validos números
	 * de 8 cifras
	 */

	public static void main(String[] args) {
		// Declaramos la variable del DNI que le pediremos al usuario
		int dni;
		// Declaramos la variable del NIF que mostraremos
		char nif;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Calcule su NIF");
		// Le pedimos al usuario su DNI
		System.out.println("Introduzca su DNI (sólo las 8 cifras numéricas)");
		// Leemos el número
		dni = sc.nextInt();
		/*
		 * Si el número se sale de los márgenes le indicamos el error y pediremos otro
		 * todas las veces necesarias hasta que introduzca un número correcto
		 */
		while (dni < 10000000 || dni > 99999999) {
			System.out.println("DNI incorrecto, sólo validos números de 8 cifras");
			System.out.println("Introdúzcalo de nuevo");
			dni = sc.nextInt();
		}
		// El valor del NIF dependerá de cada posible resultado de dni % 23
		nif = switch (dni % 23) {
		case 0 -> 'T';
		case 1 -> 'R';
		case 2 -> 'W';
		case 3 -> 'A';
		case 4 -> 'G';
		case 5 -> 'M';
		case 6 -> 'Y';
		case 7 -> 'F';
		case 8 -> 'P';
		case 9 -> 'D';
		case 10 -> 'X';
		case 11 -> 'B';
		case 12 -> 'N';
		case 13 -> 'J';
		case 14 -> 'Z';
		case 15 -> 'S';
		case 16 -> 'Q';
		case 17 -> 'V';
		case 18 -> 'H';
		case 19 -> 'L';
		case 20 -> 'C';
		case 21 -> 'K';
		case 22 -> 'E';
		default -> '@';
		};
		// Mostramos el NIF
		System.out.println("Su NIF es: " + nif);
		// Mostramos el DNI completo
		System.out.println("El DNI completo sería: " + dni + "-" + nif);
		// Cerramos el Scanner
		sc.close();
	}
}
