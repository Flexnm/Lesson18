package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Pet;
import beans.Veterinarian;

public class Program {
	public static void main(String[] args) {
		/*
		 * Demonstrating a different way to use Spring in a Maven project.
		 */
		
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test/SpringConfig.xml")) {
			
			Veterinarian vet = (Veterinarian) ctx.getBean("myVet");
			System.out.println(vet);
			
			Pet pet = (Pet) ctx.getBean("myPet");
			System.out.println(pet);
			
		}
	}
}