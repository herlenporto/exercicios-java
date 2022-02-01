package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas o jogo iniciou e terminou?");
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int tempo;
		
		if (horaFinal > horaInicial) {
			tempo = horaFinal - horaInicial;
		}
		else  {
			tempo = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		sc.close();
		
		
		

	}

}
