package estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int loop = 1; loop <= n; loop++) {
			System.out.println(loop + " " + (loop * loop) + " " + (loop * loop * loop));
		}
		
		scan.close();
	}

}
