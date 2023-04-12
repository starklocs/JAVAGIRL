package javagirl;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double pi = 3.14159;
		double area = pi * raio * raio;
		
		System.out.println("A área da circunferencia é: "+ area + " m2");
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("A área da circunferencia é: "+ area + " m2");
	}
}
