package estruturasCondicionais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		
		scan.close();

	}

}
