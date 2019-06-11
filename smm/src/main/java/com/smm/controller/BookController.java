package com.smm.controller;

import java.text.SimpleDateFormat;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smm.po.Book;
import com.smm.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	/**
	 * 查询所有图书
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String listBook(Model model) {
		List<Book> books = bookService.findAll();
		model.addAttribute("books", books);
		return "list";
	}
	
	/**
	 * 增
	 * @param book
	 * @return
	 */
	@RequestMapping("/addBook")
	public String addBook(Book book) {
		bookService.addBook(book);
		return "redirect:/list";
	}
	
	/**
	 * 改
	 * @param book
	 * @return
	 */
	@RequestMapping("/updateBook")
	public String updateBook(Book book) {
		bookService.updateBook(book);
		return "redirect:/list";
	}
	
	/**
	 * 删
	 * @param bookId
	 * @return
	 */
	@RequestMapping("/deleteBook")
	public String deleteBook(Integer bookId) {
		bookService.deleteBook(bookId);
		return "redirect:/list";
	}
	
	/**
	 * 查询一个
	 * @param bookId
	 * @return
	 */
	@RequestMapping("/findById")
	public Book findById(Integer bookId) {
		return bookService.findById(bookId);
	}
	
	/**
	 * 进入添加页面
	 * @return
	 */
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "add";
	}
	
	/**
	 * 进入修改页面
	 * @return
	 */
	@RequestMapping("/toUpdate")
	public String toUpdate(Model model, Integer bookId) {
		Book book = bookService.findById(bookId);
		if(book.getDate() != null ) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(book.getDate());
			model.addAttribute("date", date);
		}
		model.addAttribute("book", book);
		return "update";
	}
}
