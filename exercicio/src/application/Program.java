package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entities.Employee;

public class Program {

	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();
		System.out.println();
		
		List<Employee> list = new ArrayList<>();
		
		for(int loop = 0; loop < n; loop++) {
			System.out.println("Employee #" + (loop+1));
			System.out.print("Id: ");
			int id = scan.nextInt();
			while(hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = scan.nextInt();
			}
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			list.add(new Employee(id, name, salary));
			System.out.println();
		}
		System.out.print("Enter the employee id tath will have the salary increase: ");
		int idIncrease = scan.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage =scan.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println();
		
		System.out.println("Listof employees: ");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		scan.close();
	}
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}