package exercicio3_OO;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student =  new Student();
		
		student.name = sc.nextLine();
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(student);
		
		if(student.grade() >= 60.00) {
			System.out.println("PASS");
		}
		else {
			double missing = 60.00 - student.grade();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missing);
		}
		
		sc.close();
	}
}