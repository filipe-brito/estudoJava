package estruturasCondicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, troca;
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		if(n1 < n2) {
			troca = n1;
			n1 = n2;
			n2 = troca;
		}
		
		if (n1 % n2 == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		}else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		
		scan.close();
		
	}

}

