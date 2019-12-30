package com.fis.collection.map.equalandhashcode;

public class Person {
	
	private String id;
	private String name;
	private int salary;
	
	public Person(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		if (name == null) {
			if (other.name != null)
				return false;
		} 
		if (salary == other.salary && id.equals(other.id) && name.equals(other.name))
			return true;
		else
			return false;
		
	}

	
	
	

}
