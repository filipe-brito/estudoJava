package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int loop = 0; loop < n; loop++) {
			
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			
			if(y == 0) {
				System.out.println("divisao impossível");
			}else {
				System.out.println(x / y);
			}
			
		}
		
		scan.close();
		
	}

}
