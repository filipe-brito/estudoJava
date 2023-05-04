import java.util.Locale;
import java.util.Scanner;

public class exercicio1{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois valores:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int soma = x + y;
		
		System.out.println("A soma dos valores é = " + soma);
		
		scan.close();
		
	}
}