package com.vti.entity.abstracts;

import java.util.ArrayList;

public class Phone {
	private ArrayList<Contact> contact;
	
	public Phone() {
		contact = new ArrayList<Contact>();
	}
	
	public void insertContact(String name, String phone) {
		
			
	}
	
	public void removeContact(String name) {
		for (int i = 0; i<contact.size(); i++) {

			if (name.equals(contact.get(i).getName())) {
			contact.remove(i);
			i--;
			}
		}	
	}
	
	public void updateContact(String name, String newPhone) {
		
	}
	
	public void searchContact(String name){
		for (Contact contacts : contact) {
			if(name.equals(contacts.getName())){
				System.out.println(contacts.toString());
			}
			
		}
		
	} 
}
