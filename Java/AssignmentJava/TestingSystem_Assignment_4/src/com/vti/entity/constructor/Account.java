package com.vti.entity.constructor;
import java.time.LocalDate;

public class Account {
	private int id;
	private String email;
	private String username;
	private String firstName;
	private String fullName;
	private String lastName;
	private Department department;
	private Position position;
	private LocalDate createDate;
    
    
    //a
    Account(){
    	
    }
    //b
    Account(int id, String email, String firstName, String lastName, String username){
    	this.id = id;
    	this.email = email;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.username = username;
    	this.fullName = firstName + lastName;
    }
    //c
    Account(int id, String email, String firstName, String lastName, String username, Position position){
    	this.id = id;
    	this.email = email;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.username = username;
    	this.position = position;
    	this.fullName = firstName + lastName;
    	createDate = LocalDate.now();
    }
    //d
    Account(int id, LocalDate createDate, String email, String firstName, String lastName, String username, Position position){
    	this.id = id;
    	this.email = email;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.username = username;
    	this.position = position;
    	this.createDate = createDate;
    	this.fullName = firstName + lastName;
    }	
    
	
}
