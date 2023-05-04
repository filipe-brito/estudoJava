package entities;

public class EmployeeData {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeData() {
	}
	public EmployeeData(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	
	public void increseSalary(double percentage) {
		salary += salary / 100 * percentage;
	}
	
	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Salary: " + String.format("%.2f", salary);
	}
}
