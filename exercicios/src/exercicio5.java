import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o código da peça 1, a quantidade da peça 1 e o valor unitário da peça 1: ");
		int codigo1 = scan.nextInt();
		int quantidade1 = scan.nextInt();
		float valor1 = scan.nextFloat();
		
		System.out.println("Digite o código da peça 2, a quantidade da peça 2 e o valor unitário da peça 2: ");
		int codigo2 = scan.nextInt();
		int quantidade2 = scan.nextInt();
		float valor2 = scan.nextFloat();
		
		float total = (float)quantidade1 * valor1 + (float)quantidade2 * valor2;
		System.out.printf("VALOR A PAGAR = R$ %.2f", total);
		
		scan.close();
		
	}

}
