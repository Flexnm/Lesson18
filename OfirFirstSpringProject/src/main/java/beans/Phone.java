package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Phone {
	
	private String model;
	private String manufacturer;
	private String color;
	private double price;
	@Autowired
	private PhoneStore phoneStore;
	
	public Phone() {
		
	}
	
	public Phone(String model, String manufacturer, String color, double price) {
		setModel(model);
		setManufacturer(manufacturer);
		setColor(color);
		setPrice(price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return phoneStore + " sells " + color + " " + model + " phones that are made by " + manufacturer + " and are priced at " + price + "$";
	}

}
