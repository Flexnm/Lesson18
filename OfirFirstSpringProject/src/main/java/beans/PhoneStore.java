package beans;

import org.springframework.stereotype.Component;

@Component
public class PhoneStore {
	
	private String name = "Phones4Us";
	private String address = "5 Mecha st.";
	
	public String toString() {
		return name + " is a phone store located at " + address;
	}

}
