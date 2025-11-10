package br.com.poliana.Model;

import java.io.Serializable;
import java.util.Objects;

public class Person  implements Serializable{


	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstName;
	private String lasttName;
	private String address;
	private String gender;
	
	
	public Person() {
		super();
	}


	public Person(Long id, String firstName, String lasttName, String address, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.address = address;
		this.gender = gender;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLasttName() {
		return lasttName;
	}


	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	


	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", address=" + address
				+ ", gender=" + gender + "]";
	}
	
	

	
	
}
