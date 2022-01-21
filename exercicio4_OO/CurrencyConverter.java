package exercicio4_OO;

public class CurrencyConverter {
	
	public final static double IOF = 0.06;
	
	public static double converter(double price, double dollar) {
		return (dollar += dollar * IOF) * price;
	}
}
