package exercicio1_ARRAY;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.printf("Rent #%d: ", i);
			sc.nextLine();
			System.out.println();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Student(name, email);
		}
		
		System.out.println("Bussy rooms:");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}
		
		sc.close();
	}
}