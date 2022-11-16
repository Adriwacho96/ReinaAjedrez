package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	private Color color;
	private Posicion posicion;

	public Color getColor() {
		return color;
	}
public Reina() {
	setColor(Color.BLANCO);
}
	private void setColor(Color color) {
		if(color==null) {
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

}
