package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Pet;
import beans.Phone;

public class Program {
	public static void main(String[] args) {

//		Pet myPet = new Pet("Bob", "cat", 10);
//		System.out.println(myPet);
//		ctx = context
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class)) {

			Pet myPet = ctx.getBean(Pet.class); // << This requires an empty CTOR in the Object Class.
			// Can use getBean(String Object) but it requires special syntax
			// (Pet) ctx.getBean("pet"); <<< the Class name has to start with lower case
			// letter rather than upper case. In addition casting is required to the Class's
			// Object.

			// Need to set the attributes of the Object:

			myPet.setAge(10);
			myPet.setName("Garry");
			myPet.setType("dog");

			System.out.println(myPet);

			// Making a new Object:

			Pet myPet2 = ctx.getBean(Pet.class);
			myPet2.setAge(4);
			myPet2.setName("Bob");
			myPet2.setType("cat");

			System.out.println(myPet2);
			// Problem, the newest Object overrides the older Objects.
			// System.out.println(myPet);

			// The ctx Object turns the Pet class into a singleton, therefore only a single
			// object exists and it will be referenced by multiple references.
			// To fix this issue, in the bean Class add: @Scope("prototype") above the Class.
			
			// Other way to create an Object:
			Pet myPet3 = ctx.getBean(Pet.class, "Perry", "parrot", 6);
			
			System.out.println(myPet3);

			/*
			 * Create a Phone bean: model, manufacturer, color, price
			 * create two different Phone objects in main using Spring.
			 */
			System.out.println("\n==================\n");
			Phone p1 = ctx.getBean(Phone.class);
			Phone p2 = ctx.getBean(Phone.class);
			p1.setColor("Blue");
			p1.setManufacturer("Toyota");
			p1.setModel("Ferrari");
			p1.setPrice(200.0);
			p2.setColor("Red");
			p2.setManufacturer("Apple");
			p2.setModel("X22");
			p2.setPrice(5000.0);

			System.out.println(p1);
			System.out.println(p2);
			
			/*
			 * Create a singleton PhoneStore bean: name, address
			 * add the PhoneStore to the Phone Class. 
			 */

		}
		// It is still possible to create Objects with java, but it will ignore all Spring annotations (@)
		Pet pet = new Pet("Derp", "snake", 3);
		System.out.println(pet);
	}
}