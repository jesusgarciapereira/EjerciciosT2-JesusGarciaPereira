package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * ENTRADA: cuarenta y cuatro | RESULTADO ESPERADO: El dato introducido no es
	 * del tipo correcto
	 */
	// ENTRADA: 56.4 | RESULTADO ESPERADO: El dato introducido no es del tipo
	// correcto
	/*
	 * ENTRADA: 0 | RESULTADO ESPERADO: Número incorrecto, sólo validos desde el 1
	 * hasta el 99
	 */
	// ENTRADA: 6 | RESULTADO ESPERADO: seis
	// ENTRADA: 10 | RESULTADO ESPERADO: diez
	// ENTRADA: 15 | RESULTADO ESPERADO: quince
	// ENTRADA: 18 | RESULTADO ESPERADO: dieciocho
	// ENTRADA: 24 | RESULTADO ESPERADO: veinticuatro
	// ENTRADA: 50 | RESULTADO ESPERADO: cincuenta
	// ENTRADA: 67 | RESULTADO ESPERADO: sesenta y siete
	/*
	 * ENTRADA: 100 | RESULTADO ESPERADO: Número incorrecto, sólo validos desde el 1
	 * hasta el 99
	 */
	public static void main(String[] args) {

		// Declaramos las variables
		int num = 0;
		String unidadTexto, decenaTexto, apartesTexto;
		boolean correcto = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Números con letras");
		System.out.println("------------------");

		do {
			try {

				// Le pedimos al usuario un número y lo leemos
				System.out.println("Introduzca un número entre 1 y 99, lo mostraré con letras");
				num = sc.nextInt();

				// Verificamos que el número está dentro del rango válido
				while (num < 1 || num > 99) {
					System.out.println("Número incorrecto, sólo validos desde el 1 hasta el 99");
					System.out.println("Introduzca otro número");
					num = sc.nextInt();
				}

				// Asignamos este dato como correcto
				correcto = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!correcto);

		// Establecemos la relación entre las variables con un switch cada uno
		unidadTexto = switch (num % 10) {
		case 1 -> "uno";
		case 2 -> "dos";
		case 3 -> "tres";
		case 4 -> "cuatro";
		case 5 -> "cinco";
		case 6 -> "seis";
		case 7 -> "siete";
		case 8 -> "ocho";
		case 9 -> "nueve";
		default -> "";
		};

		decenaTexto = switch (num / 10) {
		case 1 -> "dieci";
		case 2 -> "veinti";
		case 3 -> "treinta";
		case 4 -> "cuarenta";
		case 5 -> "cincuenta";
		case 6 -> "sesenta";
		case 7 -> "setenta";
		case 8 -> "ochenta";
		case 9 -> "noventa";
		default -> "";
		};

		apartesTexto = switch (num) {
		case 10 -> "diez";
		case 11 -> "once";
		case 12 -> "doce";
		case 13 -> "trece";
		case 14 -> "catorce";
		case 15 -> "quince";
		case 16 -> "dieciséis"; // Aparte porque lleva tilde
		case 20 -> "veinte";
		case 26 -> "veintiséis"; // Aparte porque lleva tilde
		default -> "";
		};

		// Mostramos el resultado
		System.out.print("El número " + num + " se escribe así: ");

		// Para una cifra
		if (num <= 9)
			System.out.println(unidadTexto);

		// Para los "dieci" y los "venti" (salvo 16 y 26 porque llevan tilde)
		else if (num >= 17 && num <= 19 || num >= 21 && num <= 29 && num != 26)
			System.out.println(decenaTexto + unidadTexto);

		// Del 30 en adelante
		else if (num >= 30 && num <= 99) {

			// Con 0 en la unidad
			if (num % 10 == 0)
				System.out.println(decenaTexto);

			// Con distinto de 0 en la unidad
			else
				System.out.println(decenaTexto + " y " + unidadTexto);

			// Y para los especiales que van aparte
		} else
			System.out.println(apartesTexto);

		// Cerramos el Scanner
		sc.close();
	}
}
