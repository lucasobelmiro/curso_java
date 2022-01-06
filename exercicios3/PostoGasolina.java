package exercicios3;

import java.util.Scanner;

public class PostoGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int contAlcool = 0; 
		int contGas = 0;
		int contDiesel = 0;
		
		while (num != 4) {
			if (num == 1) {
				contAlcool ++;
			}
			else if (num == 2) {
				contGas ++;
			}
			else if (num == 3) {
				contDiesel ++;
			}
			num = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alccol: " + contAlcool);
		System.out.println("Gasolina: " + contGas);
		System.out.println("Diesel: " + contDiesel);
	}

}