package com.vti.entity.interfaces;

public class News implements INews{
	private int id; 
	private String title; 
	private String publishDate; 
	private String author; 
	private String content; 
	private float averageRate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	
	

	public News(int id, String title, String publishDate, String author, String content, float averageRate) {
		
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
	}
	@Override
	public void Display() {
		System.out.println(getTitle());
		System.out.println(getPublishDate());
		System.out.println(getAuthor());
		System.out.println(getContent());
		System.out.println(getAverageRate());
	}
	
	@Override
	public float Calculate(int[] rates) {
		float averageRate = 0;
		
		averageRate += (rates[0] + rates[1] + rates[2])/3; 
		return averageRate;
	}
	
	

}
