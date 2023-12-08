package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.DBConnection;
import model.Book;
import serializer.Serializer;

public class BookDAO {
	
	public void addBook(Book book) throws Exception {
		
		String sql = "INSERT INTO books(name, author, gener, release_year, exemplars) VALUES(?, ?, ?, ?, ?)";
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DBConnection.createConnectionToMySQL();
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, book.getName());
			statement.setString(2, book.getAuthor());
			statement.setString(3, book.getGener());
			statement.setString(4, book.getReleaseYear());
			statement.setInt(5, book.getExemplars());
			
			statement.execute();
			
			System.out.println("Livro adicionado com sucesso");
			
		} catch (Exception e) {
			Serializer.saveString("C:\\Users\\aliso\\Desktop\\Erros.txt", e.getMessage());
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				Serializer.saveString("C:\\Users\\aliso\\Desktop\\Erros.txt", e.getMessage());
			}
		}
	}
	
	public List<Book> bookList() throws Exception{
		
		String sql = "SELECT * FROM books";
		
		List<Book> books = new ArrayList<Book>();
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		
		try {
			connection = DBConnection.createConnectionToMySQL();
			
			statement = connection.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				
				int id = result.getInt("id_book");
				String name = result.getString("name");
				String author = result.getString("author");
				String gener = result.getString("gener");
				String releaseYear = result.getString("release_year");
				int exemplars = result.getInt("exemplars");
				
				Book book = new Book(id, name, author, gener, releaseYear, exemplars);
				
				books.add(book);
			}
		} catch (Exception e) {
			Serializer.saveString("C:\\Users\\aliso\\Desktop\\Erros.txt", e.getMessage());
		} finally {
			try {
				if(result != null) {
					result.close();
				}
				if (statement != null) {
					statement.close();
				}

				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				Serializer.saveString("C:\\Users\\aliso\\Desktop\\Erros.txt", e.getMessage());
			}
		}
		
		return books;
	}
}
