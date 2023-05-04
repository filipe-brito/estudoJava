
package estruturasCondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		scan.close();
		
	}

}
