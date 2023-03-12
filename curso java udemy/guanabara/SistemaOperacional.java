package guanabara;

import java.util.Properties;

public class SistemaOperacional {
	public static void main(String[] args) {
		Properties propriedade = new Properties();
		System.out.println("O meu sistema operacional é: "+(System.getProperty("os.name")));
		
	}
}
