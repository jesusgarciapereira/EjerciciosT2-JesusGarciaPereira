package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	// ENTRADA: cinco | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: 7.8 | RESULTADO ESPERADO: El dato introducido no es correcto
	// ENTRADA: 4 | RESULTADO ESPERADO: 4
	// ENTRADA: -3 | RESULTADO ESPERADO: 3
	// ENTRADA: 0 | RESULTADO ESPERADO: 0

	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos la variable del valor absoluto que mostraremos
		int valorAbsoluto;
		/*
		 * Declaramos una variable boolean para determinar si un dato ha sido
		 * introducido correctamente
		 */
		boolean correcto = false;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Valor absoluto");
		do {
			try {
				// Le pedimos al usuario un número
				System.out.println("Introduzca cualquier número entero");
				// Leemos el número
				num = sc.nextInt();
				/*
				 * Si he introducido un dato incorrecto se ejecutarán directamente las
				 * instrucciones del catch y el valor de correcto seguirá siendo false. Por el
				 * contrario se asignará como true y se ejecutarán las instrucciones siguientes
				 */
				correcto = true;
				/*
				 * Establecemos la relación entre las variables: Si el número es negativo, lo
				 * multiplicaremos por -1, si no, lo asignamos tal cual
				 */
				valorAbsoluto = (num < 0) ? num * -1 : num;
				// Mostramos el resultado
				System.out.println("|" + num + "| = " + valorAbsoluto);
				// Si he introducido un dato incorrecto...
			} catch (InputMismatchException e) {
				// ... se mostrará el siguiente resultado
				System.out.println("El dato introducido no es correcto");
				// Para evitar un bucle infinito
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
