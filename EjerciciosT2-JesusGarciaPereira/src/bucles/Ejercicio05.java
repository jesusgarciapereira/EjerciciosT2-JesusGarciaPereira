package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int numMayor;
		boolean correctoA = false;
		boolean correctoB = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mínimo común múltiplo de a y b");
		System.out.println("------------------------------");
		do {
			try {
				System.out.println("Introduzca un valor para a");
				a = sc.nextInt();
				
				// Verificamos que el número está dentro del rango válido
				while (a < 1) {
					System.out.println("Número incorrecto, sólo válidos a partir del 1");
					System.out.println("Introduzca otro número");
					a = sc.nextInt();
				}

				// Asignamos este dato como correcto
				correctoA = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el Scanner
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras no sea correcto el dato, repetiremos las instrucciones
		} while (!correctoA);
			
		
		
		System.out.println("Introduzca un valor para b");
		b = sc.nextInt();
		numMayor = a >= b ? a : b;
		for (int i = numMayor;; i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println("m.c.m.(" + a + "," + b + ") = " + i);
				break;
			}
		}
		sc.close();
	}

}
