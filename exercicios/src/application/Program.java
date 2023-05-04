package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.EmployeeData;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();
		System.out.println();
		
		List<EmployeeData> list = new ArrayList<>();
		
		for(int loop = 0; loop < n; loop++) {
			System.out.println("Employee #" + (loop+1));
			
			System.out.print("Id: ");
			int id = scan.nextInt();
			while(hasId(list, id)) {
				System.out.print("Id already taken! Try again: ");
				id = scan.nextInt();
			}
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			
			list.add(new EmployeeData(id, name, salary));
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increse: ");
		int increaseSalary = scan.nextInt();
		
		EmployeeData emp = list.stream().filter(x -> x.getId() == increaseSalary).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist! ");
		}else {
			System.out.println("Enter the percentage of increase salary: ");
			double percentage = scan.nextDouble();
			emp.increseSalary(percentage);
		}
		System.out.println();
		
		for(EmployeeData obj : list) {
			System.out.println(obj);
		}
		
		scan.close();
	}
	
	public static boolean hasId(List<EmployeeData> list, int id) {
		EmployeeData emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
