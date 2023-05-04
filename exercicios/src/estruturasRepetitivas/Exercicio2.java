package estruturasRepetitivas;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x; 
		int in;
		int out;
		
		in = 0;
		out = 0;
		
		for(int loop = 0; loop < n; loop++) {
			x = scan.nextInt();
			if(x >= 10 && x <= 20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.println("In = " + in);
		System.out.println("Out = " + out);
		
		scan.close();
		
	}

}
