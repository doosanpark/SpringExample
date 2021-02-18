package com.spring.myapp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.myapp.dao.BookDao;
import com.spring.myapp.model.Book;
import com.spring.myapp.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Resource(name="bookDao")
	private BookDao bookDao;

	@Override
	public List<Book> getBookList() {
		return bookDao.getBookList();
	}

}