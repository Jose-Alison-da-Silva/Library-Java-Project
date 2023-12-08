package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
