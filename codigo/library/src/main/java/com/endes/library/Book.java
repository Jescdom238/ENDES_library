package com.endes.library;

import java.util.List;

public abstract class Book extends BookItem{
   
	
	private String isbn;
    private String title;
    private List<Author> authors;
    private String summary;
    private String publisher;
    private String publicationDate;
    private Integer numberOfPages;
    private String language;
    
	public Book(String barcode, String rfid, boolean isReferenceOnly, String isbn, String title, List<Author> authors,
			String summary, String publisher, String publicationDate, Integer numberOfPages, String language) {
		super(barcode, rfid, isReferenceOnly);
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.summary = summary;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.numberOfPages = numberOfPages;
		this.language = language;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
