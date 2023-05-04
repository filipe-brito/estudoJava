package estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int loop = 0; loop <= x; loop++) {
			
			if(loop % 2 != 0) {
				System.out.println(loop);
			}
			
		}
		
		scan.close();
		
	}

}

