package com.osfy.app.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Books {
	
	
	private long id;
	private String bookName;
	private String authorName;
	private String description;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Books(long id, String bookName, String authorName, String description) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
