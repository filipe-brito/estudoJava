import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite quatro valores:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int diferenca = a * b - c * d;
		System.out.println("A diferença entre os valores é = " + diferenca);
		
		scan.close();

	}

}
