import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionário: ");
		int n = scan.nextInt();
		System.out.print("Digite as horas trabalhadas do funcionário: ");
		int nHoras = scan.nextInt();
		System.out.print("Digite o valor que o funcionário recebe por hora trabalhada: ");
		float valorH = scan.nextFloat();
		
		System.out.println("NUMBER = " + n);
		
		float salario = nHoras * valorH;
		System.out.printf("SALARY = U$ %.2f", salario);
		
		scan.close();

	}

}
