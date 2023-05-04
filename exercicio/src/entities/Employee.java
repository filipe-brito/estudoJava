package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary / 100 * percentage;
	}
	
	public String toString() {
		return id + ", " + name + ", R$ " + salary;
	}
}
