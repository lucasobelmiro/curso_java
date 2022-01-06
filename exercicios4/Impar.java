package exercicios4;

import java.util.Scanner;

public class Impar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N >= 1 && N <= 1000) {
			for (int i=0; i<=N; i++) {
				if((i % 2) != 0) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}
}