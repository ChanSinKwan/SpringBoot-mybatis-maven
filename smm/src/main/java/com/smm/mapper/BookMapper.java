package com.smm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smm.po.Book;

@Mapper
public interface BookMapper {
	
	/**
	 * 查询所有图书
	 * @return
	 */
	List<Book> findAll();
	
	
	/**
	 * 新增图书
	 * @param book
	 */
	int addBook(Book book);
	
	/**
	 * 修改图书
	 * @param book
	 */
	int updateBook(Book book);
	
	
	/**
	 * 删除图书
	 * @param bookId
	 */
	int deleteBook(Integer bookId);

	/**
	 * 查询图书按ID
	 * @param bookId
	 * @return
	 */
	Book findById(Integer bookId);

}
