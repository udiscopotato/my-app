package com.osfy.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osfy.app.entity.Books;
import com.osfy.app.service.BookServiceImplementation;

@RestController
public class BookController {
	
	@Autowired
	private BookServiceImplementation bookServiceImplementation;
	
	@GetMapping("/test")
	public String test() {
		return "Working Fine";
	}
	
	@GetMapping("/books")
	public List<Books> getBooks(){
		return bookServiceImplementation.getAllBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Books getBook(@PathVariable String bookId) {
		return bookServiceImplementation.getBook(Long.parseLong(bookId));
	}
	
	@PostMapping("/books/{bookId}/{bookName}/{authorName}/{description}")
	public Books saveBook(@PathVariable String bookId,@PathVariable String bookName,@PathVariable String authorName,@PathVariable String description) {
		Books book = new Books(Long.parseLong(bookId),bookName,authorName,description);
		return bookServiceImplementation.addBook(book);
	}
	
	@PutMapping("/books/{bookId}/{bookName}/{authorName}/{description}")
	public Books updateBook(@PathVariable String bookId,@PathVariable String bookName,@PathVariable String authorName,@PathVariable String description) {
		Books book = new Books(Long.parseLong(bookId),bookName,authorName,description);
		return bookServiceImplementation.updateBook(book);
	}
	
	@DeleteMapping("/books/{bookId}")
	public Books deleteBook(@PathVariable String bookId) {
		return bookServiceImplementation.deleteBook(Long.parseLong(bookId));
	}
}
