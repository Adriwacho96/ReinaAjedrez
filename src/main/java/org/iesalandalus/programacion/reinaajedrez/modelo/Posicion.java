package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;

	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	public Posicion(Posicion posicion) {
		if(posicion==null) {
			throw new NullPointerException("La posición copiada debería ser la misma que la pasada como parámetro.");
		}
		setFila(posicion.fila);
		setColumna(posicion.columna);
	}
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		this.columna = columna;
	}

}
