package exercicios1;

import java.util.Scanner;

public class Diferenca {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int diferenca = (A * B) - (C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}
}