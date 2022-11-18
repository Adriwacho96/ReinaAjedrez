package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	private Consola() {

	}

	public static void mostrarMenu() {
		System.out.println("Opcion 1. Selecciona reina blanca");
		System.out.println("Opcion 2. Elige el color de la reina");
		System.out.println("Opcion 3. Mover");
		System.out.println("Opcion 4. Salir");
	}

	public static int eligeOpcionMenu() {
		int op;
		do {
			
			op = Entrada.entero();
		} while (op < 1 || op > 4);
		
		switch (op) {
		case 1:
			System.out.println("Has elegido reina blanca");
			break;

		case 2:
			System.out.println("Elige el color de la reina");
			break;

		case 3:
			System.out.println("Mueve la pieza");
			break;

		case 4:
			System.out.println("Adiooooooos");
			break;

		}
		return op;

	}

	public static Color elegirColor() {
		Color color = null;
		int opColor;
		do {
			
			opColor = Entrada.entero();
		} while (opColor < 1 || opColor > 2);
		switch (opColor) {
		case 1:
			
			color = Color.BLANCO;
			break;

		case 2:
		
			color = Color.NEGRO;
			break;

		}
		return color;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("1. Para mover al norte");
		System.out.println("2. Para mover al noreste");
		System.out.println("3. Para mover al este");
		System.out.println("4. Para mover al sureste");
		System.out.println("5. Para mover al sur");
		System.out.println("6. Para mover al suroeste");
		System.out.println("7. Para mover al oeste");
		System.out.println("8. Para mover al noroeste");
	}

	public static Direccion elegirDirecciones() {
		Direccion position = null;
		int direccion;
		do {
			System.out.println("Elige una direccion correcta: ");
			direccion = Entrada.entero();
		} while (direccion < 1 || direccion > 8);
		switch (direccion) {
		case 1:
			System.out.println("Has elegido norte");
			position = Direccion.NORTE;
			break;
		case 2:
			System.out.println("Has elegido noreste");
			position = Direccion.NORESTE;
			break;
		case 3:
			System.out.println("Has elegido este");
			position = Direccion.ESTE;
			break;
		case 4:
			System.out.println("Has elegido sureste");
			position = Direccion.SURESTE;
			break;
		case 5:
			System.out.println("Has elegido sur");
			position = Direccion.SUR;
			break;
		case 6:
			System.out.println("Has elegido suroeste");
			position = Direccion.SUROESTE;
			break;
		case 7:
			System.out.println("Has elegido oeste");
			position = Direccion.OESTE;
			break;
		case 8:
			System.out.println("Has elegido noroeste");
			position = Direccion.NOROESTE;
			break;
		}
		return position;
	}
		public static int elegirPasos() {
			int pasos;
			do {
				System.out.println("Introduce unos pasos");
				pasos=Entrada.entero();
			} while(pasos <1 || pasos >7);
			
			return pasos;
		}
		public static void despedirse() {
			System.out.println("Adios, muy buenas!!");
		}
}