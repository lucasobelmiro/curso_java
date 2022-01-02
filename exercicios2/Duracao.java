package exercicios2;

import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio, fim, total;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			total = fim - inicio;
		}
		else {
			total = 24 - inicio + fim;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", total);
		
		sc.close();
	}
}