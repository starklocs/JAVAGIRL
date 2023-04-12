package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double Fahrenheit = 132;
		double Celsius = (Fahrenheit - 32) * 5/9;
		
		System.out.printf("Está fazendo: "+ "%.2f °C", Celsius);
	}
}
