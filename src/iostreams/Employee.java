package iostreams;

import java.io.Serializable;

public class Employee implements Serializable{

	private Integer id;
	private String name;
	private Float salary;

	public Employee(Integer id, String name, Float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, salary=%s]", id, name, salary);
	}

}
