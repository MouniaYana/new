package model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department1")
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "did",updatable=false,insertable=false)
	@Id
	
	@GeneratedValue
	private int id;

	@Column(name = "dname",updatable=true)
	private String name;

	@OneToMany(mappedBy="department",fetch=FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Employee> Employee = new HashSet<>();



	public Set<Employee> getEmployee() {
		return Employee;
	}

	public void setEmployee(Set<Employee> employee) {
		Employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
