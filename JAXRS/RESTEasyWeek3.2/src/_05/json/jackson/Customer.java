package _05.json.jackson;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
	
	@XmlElement
	private int id;
	@XmlElement
	private String name;
	@XmlElement
	private String surname;
	@XmlElement
	private Adress adress;
	
	
	public Customer() {
		super();
	}

	

	public Customer(int id, String name, String surname, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
	}



	public Adress getAdress() {
		return adress;
	}



	public void setAdress(Adress adress) {
		this.adress = adress;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	
	
	

}
