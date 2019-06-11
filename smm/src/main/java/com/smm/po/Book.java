package com.smm.po;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8406267335525676578L;

	// 条形码
	private Integer bookId;

	// 书名
	private String bookName;
	
	// 单价
	private Double bookPrice;

	// 入藏时间
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", date=" + date
				+ "]";
	}
	
}
