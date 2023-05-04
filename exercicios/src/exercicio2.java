import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = Math.pow(raio, 2) * 3.14159;
		
		System.out.printf("A área do circulo é = %.4f", area);

		scan.close();
		
	}

}
