package condicionales;

import java.util.Scanner;

public class Ejercicio05 {
	// ENTRADA: 4 | RESULTADO ESPERADO: 4
	// ENTRADA: -3 | RESULTADO ESPERADO: 3
	// ENTRADA: 0 | RESULTADO ESPERADO: 0
	public static void main(String[] args) {
		// Declaramos la variable del número que le pediremos al usuario
		int num;
		// Declaramos la variable del valor absoluto que mostraremos
		int valorAbsoluto;
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Presentamos el programa
		System.out.println("Valor absoluto");
		// Le pedimos al usuario un número
		System.out.println("Introduzca cualquier número entero");
		// Leemos el número
		num = sc.nextInt();
		/*
		 * Establecemos la relación entre las variables: Si el número es negativo, lo
		 * multiplicaremos por -1, si no, lo asignamos tal cual
		 */
		valorAbsoluto = (num < 0) ? num * -1 : num;
		// Mostramos el resultado
		System.out.println("|" + num + "| = " + valorAbsoluto);
		// Cerramos el Scanner
		sc.close();
	}
}
