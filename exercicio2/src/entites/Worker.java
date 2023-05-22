package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	/*A seguir estão as assossiações - ou composições - do objeto Worker.
	 O objeto Worker têm duas assossiações: uma lista de contratos e o objeto departamento, que são classes já criadas no projeto.
	 Essas composições do Worker devem ser instanciadas aqui na classe do Worker e marcadas no construtor da classe.
	 É recomendade não colocar listas nos construtores e nem criar um set para elas.
	 */
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	
	
	
	
	public Worker(){
	}
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	/* Método para adicionar contratos:
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	
	//Método para remover elementos de contratos:
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	
	
	
	//método para calcular a renda de um deterninado mês e ano:
	public double income(int year, int month) {
		double sum = baseSalary;
		/*
		 O código em questão cria uma nova instância da classe Java "Calendar" e inicializa-a com o valor atual do sistema.

		Aqui está uma explicação de cada parte:

		"Calendar" é uma classe Java que representa um calendário e é usada 
		para manipular datas e horários em Java. Essa classe fornece métodos 
		para obter e definir datas, horários e outras informações relacionadas ao tempo.

		"cal" é um objeto que representa uma instância da classe "Calendar". Este 
		objeto é criado pela palavra-chave "new", que aloca memória para uma nova 
		instância da classe "Calendar".

		"getInstance()" é um método estático da classe "Calendar" que retorna 
		uma instância da classe "Calendar" inicializada com o valor atual do sistema. 
		Este método é geralmente usado para obter uma instância da classe "Calendar" 
		que representa a data e hora atual do sistema.

		Assim, a linha de código "Calendar cal = Calendar.getInstance();" 
		cria um novo objeto "cal" da classe "Calendar" e o inicializa com a 
		data e hora atuais do sistema, que são obtidas usando o método estático 
		"getInstance()". Depois de executar essa linha de código, o objeto "cal" 
		pode ser usado para manipular e exibir datas e horários em Java:
		 */
		Calendar cal = Calendar.getInstance();
		
		
		
		
		
		
		//for para percorrer a lista de contratos:
		for(HourContract c : contracts) {
			
			
			
			
			
			
			
			
			
			/*
			 "c.getDate()" chama um método "getDate()" na instância "c" 
			 para obter a data desejada.

			"setTime()" é um método da classe Calendar que define a data e hora do 
			objeto "calendário" com a data fornecida.

			Portanto, o seguinte código cria um novo objeto "calendário" e o configura 
			para a data e hora contidas no objeto "c". Podemos usar o objeto "cal" 
			para obter informações sobre a data e hora definidas ou para realizar 
			cálculos com datas e horas.
			 */
			cal.setTime(c.getDate());
			
			
			
			
			//variável que recebe o valor do ano do contrato analisado neste momento pelo "for":
			int c_year = cal.get(Calendar.YEAR);
			
			//variável que recebe o valor do mês do contrato analisado neste momento pelo "for":
			int c_month = 1 + cal.get(Calendar.MONTH); //O mês do Calender começa com 0, então convém somar "1"
			
			//Vamos testar se o mês e o ano correspondem aos solicitados e fazer a soma:
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
