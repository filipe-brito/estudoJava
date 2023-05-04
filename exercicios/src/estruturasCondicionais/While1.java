package estruturasCondicionais;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int senha = 2002;
		System.out.print("Digite a senha: ");
		int x = scan.nextInt();
		
		if (x == senha) {
			System.out.println("ACESSO PERMITIDO");
		}else {
			while(x != senha) {
				
				System.out.println("SENHA INVÁLIDA! ");
				System.out.print("Digite a senha: ");
				x = scan.nextInt();
				
			}
			
		}
		
		System.out.println("ACESSO PERMITIDO");
		
		scan.close();
		
	}

}
