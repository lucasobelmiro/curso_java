package exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		double imposto;
		
		if (salary >= 0.00 && salary <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salary >= 2000.01 && salary < 3000.00) {
			imposto = (salary - 2000) * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		
		else if(salary >= 3000.01 && salary < 4500.00) {
			imposto = (1000 * 0.08) + ((salary - 3000) * 0.18);
			System.out.printf("R$ %.2f", imposto);
		}
		else {
			imposto = ((1000 * 0.08) + (1500.00 * 0.18) + (salary - 4500.00)* 0.28); 
			System.out.printf("R$ %.2f", imposto);
		}
		
		sc.close();
	}
}