package com.github.felixcolombo.jokenpo;

import java.util.Scanner;

public class Jokenpo {
	private static Scanner keyboard = new Scanner(System.in);
	private String jogadas;
	String jogadaSplit[];
	private String jogadorA;
	private String jogadorB;
	private int jogA = 0;
	private int jogB = 0;
	private int empate = 0;
	
	public void jokenpo() {
				
		do{
			System.out.println("Informe a jogada: ");
			jogadas = keyboard.nextLine().toUpperCase();
			
			if(!(jogadas.equals(""))) {
				
				jogadaSplit = jogadas.split(" ");
				
				jogadorA = jogadaSplit[0];
				jogadorB = jogadaSplit[1];
				
				if(jogadas.equals("R S")||jogadas.equals("P R")||jogadas.equals("S P")) {
					jogA++;
				}else if(jogadorA.equals(jogadorB)) {
					empate++;
				}else {
					jogB++;
				}
			}
		}while(!jogadas.equals(""));
	
		System.out.printf("Jogador A: %d x Jogador B: %d x Empate: %d", jogA, jogB, empate);
		
	}
	
}
