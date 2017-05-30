package com.springbootbooksApp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book", schema = "booksdb", catalog="")
public class Book {
	
	
	public int book_id;
	private String title;
	private String author_lastName;
	private String author_firstName;
	private Double price;
	private String currency;
	private String publishDate;
	private String description;
	private String imageLink;
	
	@Id
	@Column(name = "book_id", nullable = false) 
	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	@Basic 
	@Column(name = "title", nullable = false, length = 50)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Basic
	@Column(name = "author_lastName", nullable = false, length = 50)
	public String getAuthor_lastName() {
		return author_lastName;
	}

	public void setAuthor_lastName(String author_lastName) {
		this.author_lastName = author_lastName;
	}

	@Basic
	@Column(name = "author_firstName", nullable = true, length = 50)
	public String getAuthor_firstName() {
		return author_firstName;
	}

	public void setAuthor_firstName(String author_firstName) {
		this.author_firstName = author_firstName;
	}


	@Basic
	@Column(name = "price", nullable = true)
	public Double getPrice() {
		return price;
	}

	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Basic
	@Column(name = "currency", nullable = true, length=10)
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Basic
	@Column(name = "publish_date", nullable = true, length = 10)
	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	@Basic
	@Column(name = "short_description", nullable = true, length=200)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name = "image_link", nullable = true, length = 100)
	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	
	
}
