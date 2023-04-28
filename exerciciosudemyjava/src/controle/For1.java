package controle;


public class For1 {
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Bomd dia!");
		}

		int x = 2;
		for (; x < args.length; x++) {
			System.out.println("x = " + x);
			x++;
		}

	}
}
