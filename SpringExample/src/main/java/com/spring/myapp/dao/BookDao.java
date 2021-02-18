package com.spring.myapp.dao;

import java.util.List;

import com.spring.myapp.model.Book;

public interface BookDao {
	
	List<Book> getBookList();

}