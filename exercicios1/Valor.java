package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Valor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, quant1, quant2;
		double valor1, valor2;
		
		cod1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		double total = (valor1 * quant1) + (valor2 * quant2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		sc.close();
	}
}