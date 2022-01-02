package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod, quant;
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		double preco, total;
		preco = 0.00;
		
		if (cod == 1) {
			preco = 4.00;
		}
		else if (cod == 2) {
			preco = 4.50;
		}
		else if (cod == 3) {
			preco = 5.00;
		}
		else if (cod == 4) {
			preco = 2.00;
		}
		else if (cod == 5) {
			preco = 1.50;
		}
		
		total = preco * quant;
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}
}