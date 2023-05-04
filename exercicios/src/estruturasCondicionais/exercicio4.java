package estruturasCondicionais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int duracao = 0;
		
		if (n1 > n2) {
			
			duracao = n2 + 24 - n1;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
		}else if(n1 < n2){
			
			duracao = n2 - n1;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
		}else {
			
			System.out.println("O JOGO DUROU 24 HORA(S)");
			
		}
		
		scan.close();
	}

}
