package model;

public class Book {
	private int id;
	private String name;
	private String author;
	private String gener;
	private String releaseYear;
	private int exemplars;
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getExemplars() {
		return exemplars;
	}
	public void setExemplars(int exemplars) {
		this.exemplars = exemplars;
	}
	
	public Book(String name, String author, String gener, String releaseYear, int exemplars) {
		this.name = name;
		this.author = author;
		this.gener = gener;
		this.releaseYear = releaseYear;
		this.exemplars = exemplars;
	}
	
}
