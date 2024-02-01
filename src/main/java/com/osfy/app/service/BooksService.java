package com.osfy.app.service;

import java.util.List;

import com.osfy.app.entity.Books;

public interface BooksService {
	
	public List<Books> getAllBooks();
	public Books getBook(long id);
	public Books addBook(Books book);
	public Books updateBook(Books book);
	public Books deleteBook(long id);
}
