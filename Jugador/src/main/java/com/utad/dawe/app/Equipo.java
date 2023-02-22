package com.utad.dawe.app;

import java.util.Scanner;

import com.utad.dawe.model.JugadorBalonMano;

public class Equipo {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		JugadorBalonMano jugador1 = new JugadorBalonMano("pepe", 10);
		JugadorBalonMano jugador2 = new JugadorBalonMano("manolo", 10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Jornada " + (i+1));
			System.out.println("¿Cuantas anotaciones ha hecho el jugador 1 en la jornada?");
			jugador1.setAnotacion((sc.nextInt())+ jugador1.getAnotacion());
			System.out.println("¿Cuantas anotaciones ha hecho el jugador 2 en la jornada?");
			jugador2.setAnotacion((sc.nextInt())+ jugador2.getAnotacion());
			System.out.println("¿Cuantos bloqueos ha hecho el jugador 1 en la jornada?");
			jugador1.setBloqueo((sc.nextInt())- jugador1.getBloqueo());
			System.out.println("¿Cuantos bloqueos ha hecho el jugador 2 en la jornada?");
			jugador2.setBloqueo((sc.nextInt())- jugador2.getBloqueo());
			System.out.println("¿cuanto tiempo ha jugado el jugador 1 en la jornada?");
			jugador1.setTiempoJugado((sc.nextInt())- jugador1.getTiempoJugado());
			System.out.println("¿cuanto tiempo ha jugado el jugador 2 en la jornada?");
			jugador2.setTiempoJugado((sc.nextInt())- jugador2.getTiempoJugado());
			if(i==5) {
				jugador1.toString();
				jugador2.toString();
			}
		}
		jugador1.toString();
		jugador2.toString();
	}

}
