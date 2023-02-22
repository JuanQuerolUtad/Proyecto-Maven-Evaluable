package com.utad.dawe.model;

public class JugadorBalonMano {
	private String nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int tiempoJugado;
	public JugadorBalonMano(String nombre, int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
	}
	
	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}

	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	public void setTiempoJugado(int tiempoJugado) {
		this.tiempoJugado = tiempoJugado;
	}

	public int getAnotacion() {
		return anotacion;
	}

	public int getBloqueo() {
		return bloqueo;
	}

	public int getTiempoJugado() {
		return tiempoJugado;
	}

	public String toString() {
		return "JugadorBalonMano [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
				+ bloqueo + ", tiempoJugado=" + tiempoJugado + "]";
	}
	
	
}
