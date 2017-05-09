package com.hclA;

public class PersonsData {
	
	private Person[] persons = new Person[100]; //max for illustration
	
	private class Person {
		Person(int id, String name, String phone , String address) {
			this.id = id;
			this.name = name;
			this.address = address;
			this.phone = phone;
		}

		public String toString() {
			return "id:" + id 
			+ " name:" + name 
			+ "address:" + address
			+ "phone:" + phone;
		}
		
		private int id;
		private String name;
		private String address;
		private String phone;
	}
	public Person getPersons(int id) {
		return persons[id];
	}
	public void addPersons(Person person) {
		this.persons[person.id] = person;
	}
	
	public static void main(String[] args) {
		PersonsData pData = new PersonsData();
		
		PersonsData.Person p1 = pData. new Person(1, "myself", "my-999-phone", "my address");
		pData.addPersons(p1);
		
		PersonsData.Person p2 = pData. new Person(2, "myself2", "my-999-phone2", "my address2");
		pData.addPersons(p2);

		System.out.println(pData.getPersons(1));
		System.out.println(pData.getPersons(2));

	}
}
