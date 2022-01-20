package exercicio3_OO;

public class Student {
	
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double grade() {
		return (this.note1 + this.note2 + this.note3);
	}
	
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", grade());
	}
}
