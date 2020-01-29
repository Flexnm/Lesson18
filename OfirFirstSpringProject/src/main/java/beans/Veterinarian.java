package beans;

import org.springframework.stereotype.Component;

@Component
public class Veterinarian {

	private String name = "Roni";
	private String adress = "29 Wall and Tower st.";
	private double hourlyRate = 540.5;
	
	public String toString() {
		return name + " is the veterinarian of the town. She can be found at " + adress + " and her hourly rate is " + hourlyRate;
	}
	
}
