package com.kush;

import java.util.HashMap;
import java.util.Map;

public class TestAccount {

	public static void main(String[] args) {
		
		Account acc1 = new Account();
		acc1.setId("1");
		acc1.setName("Kush");

		Account acc2 = new Account();
		acc2.setId("2");
		acc2.setName("Luv");

		HashMap<Account, String> hm = new HashMap();
		hm.put(acc1, acc1.getName());
		hm.put(acc2, acc2.getName());

		for (Map.Entry entry : hm.entrySet())
			System.out.println("Key: [" + entry.getKey() + "] and value is: " + entry.getValue());

		Account acc3 = new Account();
		acc3.setId("1");
		acc3.setName("Sak");

		hm.put(acc3, acc3.getName());

		System.out.println("After again duplicate object addition:");

		for (Map.Entry entry : hm.entrySet())
			System.out.println("Key: [" + entry.getKey() + "] and value is: " + entry.getValue());
	}

}

class Account {

	private String id;
	private String name;

	public Account() {
	}

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "id = " + this.id + "name = " + this.name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	 @Override
	 public int hashCode() {
       /* final int prime = 31;
	        int result = 1;
	       result = prime * result + Integer.parseInt(this.id);  
	       return result;*/
	       return id.hashCode();
	 }

	// Compare only account id
	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Account other = (Account) obj;

		if (id.equals(other.id))
			return true;
		return false;
	}

}
