package com.fis.pojoclass;

public class NoOfWords implements Comparable<NoOfWords> {

	String name;
	int count;

	public NoOfWords(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int compareTo(NoOfWords obj) {

		if (count < obj.count) {
			return 1;
		} else if (count > obj.count) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		NoOfWords other = (NoOfWords) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (name.equals(other.name))
			return true;
		return false;
	}

	public String toString() {
		return "::::name= " + name + " :::count= " + count;
	}
}
