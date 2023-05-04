package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double n1, n2, n3;
		
		for(int loop = 0; loop < n; loop++) {
			double mediaP = 0;
			
			n1 = scan.nextDouble();
			n2 = scan.nextDouble();
			n3 = scan.nextDouble();
			
			mediaP = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			System.out.printf("%.1f\n", mediaP);
		}
		
		scan.close();

	}

}
