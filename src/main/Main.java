package main;

import dao.BookDAO;
import model.Book;

public class Main {

	public static void main(String[] args) throws Exception {
		BookDAO bookDAO = new BookDAO();
		
		/*
		Book book = new Book("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Ficção", "2023", 7);
		Book book2 = new Book("A Arte da Guerra", "Sun Tzu", "Psicologia", "2023", 4);
		Book book3 = new Book("Romeu e Julieta", "William Shakespeare", "Romance", "2021", 11);
		
		bookDAO.addBook(book);
		bookDAO.addBook(book2);
		bookDAO.addBook(book3);
		
		for (Book books : bookDAO.bookList()) {
			System.out.println(books.toString());
		}
		
		Book book2 = new Book(12, "A Arte da Guerra", "Sun Tzu", "Psicologia", "2023", 12);
		bookDAO.updateBook(book2);
		
		bookDAO.deleteByID(14);*/

	}

}
