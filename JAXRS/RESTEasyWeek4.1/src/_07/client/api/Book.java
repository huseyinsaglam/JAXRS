package _07.client.api;

public class Book {
	
	
	private String name;
	private String surname;
	
	
	
	
	public Book() {
		super();
	}
	public Book(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	

}
