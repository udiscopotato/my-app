package com.subham.myapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.subham.myapp.entity.Books;


@Service
public class BookServiceImplementation implements BookService{
	
	List<Books> list;
	
	public BookServiceImplementation() {
		list=new ArrayList<Books>();
		list.add(new Books(122,"Project Hail Mary","Andy Weir","An amnesiac astronaut wakes up on a spaceship miollions of miles from Earth, with no memory of how he got there or his mission. As he pieces together his past, he uncovers a conspiracy that threatens humanity and must find a way to save the world."));
		list.add(new Books(123,"Shuggie Bain","Douglas Stuart","Set in 1980s Glasgow, the book follows the life of Shuggie, a young boy growing up in poverty with an alcoholic mother. The book explores themes of addiction, family, and resilience."));
		list.add(new Books(124,"Hamnet","Maggie O'Farrell","A fictionalized account of the life of Hamnet Shakespeare, William Shakespeare's son who died at the age of 11. The book explores themes of grief, loss, and the power of imagination."));
		list.add(new Books(125,"Matrix","Lauren Groff","An exploration of life in a 12th-century English abbey, weaving history, religion, and personal narratives into a tapestry of human experiences."));
		list.add(new Books(126,"Freshwater","Akwaeke Emezi","A lyrical novel about a young Nigerian woman navigating Igbo traditions and her own evolving identity, blending magical realism and personal growth."));
		list.add(new Books(127,"The Candy House","Jennifer Egan","A captivating story about a group of tech workers experimenting with mind-altering technology, raising questions about reality, memory, and connection."));
		list.add(new Books(128,"Caste: The Origins of Our Discontents","Isabel Wilkerson","A powerful exploration of the caste system in the United States, tracing its historical roots and contemporary manifestations across race, class, and gender."));
	}

	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Books getBook(long id) {
		// TODO Auto-generated method stub
		Books book =null;
		for(Books b:list) {
			if(id == b.getId()) {
				book=b;
				break;
			}
		}
		return book;
	}

	@Override
	public Books addBook(Books book) {
		// TODO Auto-generated method stub
		list.add(book);
		return book;
	}

	@Override
	public Books updateBook(Books book) {
		// TODO Auto-generated method stub
		Books c=null;
		for(Books d:list) {
			if(book.getId() == d.getId()) {
				d.setBookName(book.getBookName());
				d.setAuthorName(book.getAuthorName());
				d.setDescription(book.getDescription());
				c=d;
				break;
			}
		}
		if(c==null) {
			list.add(book);
		}
		return book;
	}

	@Override
	public Books deleteBook(long id) {
		Books book=null;
		for(Books b:list) {
			if(id==b.getId()) {
				book=b;
				list.remove(b);
				break;
			}
		}
		return book;
	}
}
