package _06.json.jettison;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
@XmlAccessorType(XmlAccessType.FIELD)

// yukar�dakiler olmazsa hata al�r�z..
public class Product {

	//RESTEasy allows you to marshall JAXB annotated POJOs to and from JSON.

	@XmlElement 
	private int id;

	@XmlElement
	private String name;

	@XmlElement
	private String brand;

	@XmlElement
	private double price;

	@XmlElement
	private String category;

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
