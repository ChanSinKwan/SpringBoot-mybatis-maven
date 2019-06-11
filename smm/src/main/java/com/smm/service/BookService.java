package com.smm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smm.mapper.BookMapper;
import com.smm.po.Book;

@Service
public class BookService {

	@Autowired
	private BookMapper bookMapper;
	
	/**
	 * 查询所有图书
	 * @return
	 */
	public List<Book> findAll(){
		return bookMapper.findAll();
	}
	
	/**
	 * 添加图书
	 * @param book
	 */
	@Transactional
	public int addBook(Book book) {
		return bookMapper.addBook(book);
	}
	
	/**
	 * 修改图书
	 * @param book
	 */
	@Transactional
	public int updateBook(Book book) {
		return bookMapper.updateBook(book);
	}
	
	/**
	 * 删除图书
	 * @param bookId
	 */
	@Transactional
	public int deleteBook(Integer bookId) {
		return bookMapper.deleteBook(bookId);
	}
	
	/**
	 * 查询指定图书
	 * @param bookId
	 * @return
	 */
	public Book findById(Integer bookId) {
		return bookMapper.findById(bookId);
	}
}
