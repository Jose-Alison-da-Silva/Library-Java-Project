package model;

public class Client {
	private int id;
	private String name;
	private String phone;
	private int unreturnedBooks;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUnreturnedBooks() {
		return unreturnedBooks;
	}
	public void setUnreturnedBooks(int unreturnedBooks) {
		this.unreturnedBooks = unreturnedBooks;
	}
	
	public Client(String name, String phone, int unreturnedBooks) {
		this.name = name;
		this.phone = phone;
		this.unreturnedBooks = unreturnedBooks;
	}
	
	
}
