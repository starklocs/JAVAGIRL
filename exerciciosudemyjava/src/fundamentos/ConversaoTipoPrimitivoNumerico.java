package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //conversão implicita!!
		System.out.println(a);
		
		float b = (float) 1.12345; //conversao explicita (cast)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //conversao explicita (cast)
		System.out.println(d);
		
		double e = 1.4574774; //conversao explicita (cast) perda de informação
		int f = (int) e;
		System.out.println(f);
		
		
		
	}
}
