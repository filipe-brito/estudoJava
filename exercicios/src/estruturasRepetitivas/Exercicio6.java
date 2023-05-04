package estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int loop = 1; loop <= n; loop++) {
			if(n % loop == 0) {
				System.out.println(loop);
			}
		}
		
		scan.close();
	}

}
