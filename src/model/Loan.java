package model;

public class Loan {
	private int id;
	private int idClient;
	private int idBook;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Loan(int idClient, int idBook, String status) {
		this.idClient = idClient;
		this.idBook = idBook;
		this.status = status;
	}
	
	
}
