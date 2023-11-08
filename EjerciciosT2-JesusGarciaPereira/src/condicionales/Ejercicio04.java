package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	/*
	 * ENTRADA: cuarenta y cuatro | RESULTADO ESPERADO: El dato introducido no es
	 * correcto
	 */
	// ENTRADA: 56.4 | RESULTADO ESPERADO: El dato introducido no es correcto
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
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos las variables de los textos que mostraremos
		String unidadTexto, decenaTexto, apartesTexto;
		/*
		 * Declaramos una variable boolean para determinar si un dato ha sido
		 * introducido correctamente
		 */
		boolean correcto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Números con letras");
		do {
			try {
				// Le pedimos al usuario un número
				System.out.println("Introduzca un número entre 1 y 99, lo mostraré con letras");
				// Leemos el número
				num = sc.nextInt();
				/*
				 * Si el número se sale de los márgenes le indicamos el error y pediremos otro
				 * todas las veces necesarias hasta que introduzca un número correcto
				 */
				while (num < 1 || num > 99) {
					System.out.println("Número incorrecto, sólo validos desde el 1 hasta el 99");
					System.out.println("Introduzca otro número");
					num = sc.nextInt();
				}
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de correcto seguirá siendo false. Por el
				 * contrario se asignará como true y se ejecutarán las instrucciones siguientes
				 */
				correcto = true;
				// El texto de la unidad dependerá de cada posible resultado de: num % 10
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
				// El texto de la decena dependerá de cada posible resultado de: num / 10
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
				// Esta variable es para los números aparte, con un texto muy concreto
				apartesTexto = switch (num) {
				case 10 -> "diez";
				case 11 -> "once";
				case 12 -> "doce";
				case 13 -> "trece";
				case 14 -> "catorce";
				case 15 -> "quince";
				case 16 -> "dieciséis";
				case 20 -> "veinte";
				case 26 -> "veintiséis";
				default -> "";
				};
				// Mostramos la primera parte del resultado
				System.out.print("El número " + num + " se escribe así: ");
				// Si el número tiene sólo una cifra...
				if (num <= 9)
					// ... mostraremos el texto de la unidad
					System.out.println(unidadTexto);
				// Si es un "dieci" o un "veinti"... (excluyendo el 16 y 26 porque llevan tilde)
				else if (num >= 17 && num <= 19 || num >= 21 && num <= 29 && num != 26)
					// ... mostraremos el texto de la decena pegado al de la unidad
					System.out.println(decenaTexto + unidadTexto);
				// Si está entre el 30 y el 99...
				else if (num >= 30 && num <= 99) {
					// ... y la unidad es 0...
					if (num % 10 == 0)
						// ... mostraremos sólo el texto de la decena
						System.out.println(decenaTexto);
					// ... y la unidad es distinta de 0...
					else
						/*
						 * ... mostraremos el texto de la decena y el de la unidad separadas por la
						 * conjunción "y"
						 */
						System.out.println(decenaTexto + " y " + unidadTexto);
				} else
					// Todos los números restantes tienen su propio texto en un switch aparte
					System.out.println(apartesTexto);
				// Si he introducido un dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es del tipo correcto");
				// Para limpiar el Scanner
				sc.nextLine();
			}
		} while (correcto == false); /*
										 * Se ejecutarán de nuevo las instrucciones del do, hasta que se introduzca un
										 * dato correcto
										 */
		// Cerramos el Scanner
		sc.close();
	}
}
