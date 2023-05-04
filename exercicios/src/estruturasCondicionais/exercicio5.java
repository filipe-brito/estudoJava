package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int codigo = scan.nextInt();
		int quantidade = scan.nextInt();
		double preco = 0.0;
		
		switch(codigo) {
		case 1:
			preco += 4.00 * quantidade;
			break;
		case 2:
			preco += 4.50 * quantidade;
			break;
		case 3:
			preco += 5.00 * quantidade;
			break;
		case 4:
			preco += 2.00 * quantidade;
			break;
		case 5:
			preco += 1.50 * quantidade;
			break;
		default:
			System.out.println("VALOR INVÁLIDO!");
		}
		
		
		
		System.out.printf("TOTAL: R$ %.2f", preco);
		
		scan.close();

	}

}
