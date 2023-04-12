package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		s = s.toUpperCase();
		
		System.out.println(s);
		
		System.out.println("Laura".toUpperCase());
		
		//a ordem altera o resultado!!!!
	}
}
