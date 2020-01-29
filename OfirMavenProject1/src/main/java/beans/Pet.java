package beans;

public class Pet {
	
	private String name;
	private String type;
	private int age;
	private Veterinarian myVet;
	
//	public Pet() {
//		
//	}

	public Pet(String name, String type, int age) {
		setName(name);
		setType(type);
		setAge(age);
		setMyVet(myVet);
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
	
	public Veterinarian getMyVet() {
		return myVet;
	}

	public void setMyVet(Veterinarian myVet) {
		this.myVet = myVet;
	}


	public String toString() {
		return name + " is my pet " + type + " and it is " + age + " years old. [" + myVet + "]";
	}

}
