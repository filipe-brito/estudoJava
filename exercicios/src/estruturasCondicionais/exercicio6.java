package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double n = scan.nextDouble();
		
		if (n >= 0 && n <= 25) {
			System.out.println("INTERVALO (0, 25)");
		}else if(n > 25 && n <= 50) {
			System.out.println("INTERVALO (25, 50)");
		}else if(n > 50 && n <= 75) {
			System.out.println("INTERVALO (50, 75)");
		}else if(n > 75 && n <= 100) {
			System.out.println("INTERVALO (75, 100)");
		}else {
			System.out.println("Fora de intervalo");
		}
		
		scan.close();

	}

}
