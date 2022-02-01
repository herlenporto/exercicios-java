package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite código e quantidade do item:");
		
		int cod = sc.nextInt();
		double quant = sc.nextDouble();

		if (cod == 1) {
			System.out.printf("Total: R$%.2f ", quant * 4);
		} else if (cod == 2) {
			System.out.printf("Total: R$%.2f ", quant * 4.50);
		 
		} else if (cod == 3) {
			System.out.printf("Total: R$%.2f ", quant * 5);
		} else if (cod == 4) {
			System.out.printf("Total: R$%.2f ", quant * 2);
		} else if (cod == 5) {
			System.out.printf("Total: R$%.2f ", quant * 1.50);
		} else { 
			System.out.println("Código invalido");			
		}
		sc.close(); 
		
	}

}
