package exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double perHours = sc.nextDouble();
		double salary = hours * perHours;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}
}