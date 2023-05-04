import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 valores: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double areaTR = a * c / 2;
		double areaC = 3.14159 * (Math.pow(c, 2));
		double areaT = (a + b) * c / 2;
		double areaQ = Math.pow(b, 2);
		double areaR = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", areaTR);
		System.out.printf("CIRCULO: %.3f\n", areaC);
		System.out.printf("TRAEZIO: %.3f\n", areaT);
		System.out.printf("QUADRADO: %.3f\n", areaQ);
		System.out.printf("RETANGULO: %.3f\n", areaR);
				
		scan.close();
	}

}
