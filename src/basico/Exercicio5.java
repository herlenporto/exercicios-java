package basico;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Cod peça, numero de peças e valor:");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, 
		cod2, 
		numero1, 
		numero2;
		
		double valor1, 
		valor2, 
		total;
		
		cod1 = sc.nextInt(); 
		numero1 = sc.nextInt(); 
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt(); 
		numero2 = sc.nextInt(); 
		valor2 = sc.nextDouble();
		
		total = (numero1 * valor1) + (numero2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		sc.close();
	}
}
