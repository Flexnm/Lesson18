package beans;

public class Veterinarian {

	private String name;// = "Roni";
	private String address;// = "29 Wall and Tower st.";
	private double hourlyRate;// = 540.5;

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	

	public String toString() {
		return name + " is the veterinarian of the town. She can be found at " + address + " and her hourly rate is "
				+ hourlyRate;
	}

}
