package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Department;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		  
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName =scan.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = scan.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = scan.nextInt();		
		
		for(int loop = 1; loop <= n; loop++) {
			System.out.println("Enter contract #" + loop + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			
			
			/*parse: É um método da classe SimpleDateFormat que converte uma String em um objeto 
			 * Date, seguindo o formato especificado pelo SimpleDateFormat associado. No código 
			 * fornecido, sdf.parse(scan.next()) está sendo usado para analisar a entrada fornecida 
			 * pelo usuário como uma data.
			 */
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scan.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);//isso faz com que o "contract" seja associado ao "worker"
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income(MM/YYYY): ");
		String monthAndYear = scan.next();//A data é lida como String mesmo e nos trechos seguintes que ocorre a conversão
		int month = Integer.parseInt(monthAndYear.substring(0, 2));//converte as caracteres nas posições de "0" à "1" em int
		int year = Integer.parseInt(monthAndYear.substring(3));//converte as caracteres a partir da posição "3" em int
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,  month)));
		
		scan.close();
		
	}

}
