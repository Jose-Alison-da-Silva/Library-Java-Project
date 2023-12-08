package model;

public class Librarian {
	private int id;
	private String name;
	private String cpf;
	private String phone;
	private double wage;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public Librarian(String name, String cpf, String phone, double wage) {
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.wage = wage;
	}
	
	public Librarian(String name, String cpf, String phone) {
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
	}
	
	
	
	
}
