package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}

	public Reina() {
		setColor(Color.BLANCO);
	}

	public Reina(Color color) {
		setColor(color);
		}
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		if (color == Color.BLANCO) {
			this.posicion = new Posicion(1, 'd');
		}
		if (color == Color.NEGRO) {
			this.posicion = new Posicion(8, 'd');
		}
		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: La posición no puede ser nula");
		}
		this.posicion = posicion;
	}
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if(pasos <1 || pasos >7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		if(direccion==null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
			
		}
	}

	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion + ")";
	}
}
