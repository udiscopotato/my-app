package com.subham.myapp.service;

import java.util.List;

import com.subham.myapp.entity.Books;

public interface BookService {
	public List<Books> getAllBooks();
	public Books getBook(long id);
	public Books addBook(Books book);
	public Books updateBook(Books book);
	public Books deleteBook(long id);
}
