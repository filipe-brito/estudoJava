package estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int fatorial = n;
		
		for(int loop = n; loop > 1; loop--) {
			fatorial = fatorial * (loop-1);
		}
		System.out.println(fatorial);
		
		scan.close();
	}

}
