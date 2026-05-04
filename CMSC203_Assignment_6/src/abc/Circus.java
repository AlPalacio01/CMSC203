/*
 * Class: CMSC203 32324
 * Instructor: Grigoriy Grinberg
 * Description: In this assignment, we will have to design and implement numerous subclasses and superclasses. 
 * For example, Clerk and Acrobatic are subclasses of the Person Class, TicketingOffice and Arena are subclasses 
 * of the Building Interface, and finally Dog, Horse, Bird, and Lion are subclasses of Animal amongst other classes. 
 * The entire program will have us display the attributes of Person, Animal and Building, as well as ticketing information.
 * Due: 05/04/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alejandro Palacio
*/
package abc;

import java.util.ArrayList;
import java.util.List;

public class Circus {
    private List<Animal> animals;
    private List<Person> persons;
    private List<Building> buildings;

    public Circus() {
        animals = new ArrayList<>();
        persons = new ArrayList<>();
        buildings = new ArrayList<>();
    }


	public void addBuilding(Building building) {
		
		buildings.add(building);
	}

	public void displayAllBuildings() {
		
		for (Building building: buildings) {
			System.out.println(building);
		}
	}

	public void addPerson(Person person) {
		
		persons.add(person);
	}

	public void displayAllPersons() {
		
		for (Person person: persons) {
			System.out.println(person);
		}
	}
	
	public void addAnimal(Animal animal) {
		
		animals.add(animal);
	}

	public void displayAllAnimals() {
		
		for (Animal animal: animals) {
			System.out.println(animal);
			animal.makeSound();
			animal.move();
			System.out.println();
		}
	}
	
	public List<Animal> getAnimals(){
		
		return animals;
	}
	
	public List<Person> getPersons(){
		
		return persons;
	}
	
	public List<Building> getBuildings(){
		
		return buildings;
	}
	
	public Object sortAnimalsByAge() {
		
		for (int i = 0; i < animals.size()- 1; i++) {
			for(int j = 0; j < animals.size()- 1; j++) {
				
				if (animals.get(j).getAge()> animals.get(j+ 1).getAge()) {
					
					Animal tempAnimal = animals.get(j);
					animals.set(j, animals.get(j+ 1));
					animals.set(j+ 1, tempAnimal);
					
				}
			}
		}
		return animals;
	}
	
	public void sortAnimalsByName() {
		
		for (int i = 0; i < animals.size()- 1; i++) {
			for(int j = 0; j < animals.size()- 1; j++) {
				
				if (animals.get(j).getName().compareToIgnoreCase(animals.get(j+ 1).getName())> 0) {
					
					Animal tempAnimal = animals.get(j);
					animals.set(j, animals.get(j+ 1));
					animals.set(j+ 1, tempAnimal);
				}
			}
		}
	}
	
	public void searchAnimalByName(String name) {
		
		boolean animalFound = false;
		
		for (Animal animal: animals) {
			
			if(animal.getName().equalsIgnoreCase(name)) {
				
				System.out.println(animal);
				animalFound = true;
			}
		}
		if (animalFound == false)
		System.out.println(name + " Not found");
		
	}



}
















