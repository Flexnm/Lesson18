package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Mark this class for Spring - it can now manage it.
@Scope("prototype")
public class Pet {

	private String name;
	private String type;
	private int age;
	@Autowired // use Dependency Injection to make Spring give us the Veterinarian.
	private Veterinarian myVet;
	
	public Pet() {
		
	}

	public Pet(String name, String type, int age) {
		setName(name);
		setType(type);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + " is my pet " + type + " and it is " + age + " years old. [" + myVet + "]";
	}
}