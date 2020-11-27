package ua.lviv.lgs;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ZooClub {
	
	Map<Person, List<Pet>> map = new HashMap<>();
	
	public void allClub() {
						
		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for(Entry<Person, List<Pet>> entry : entrySet) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
		
	}
	public void addPerson () {
		
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String personName = sc.next();
		System.out.println("Enter persons age");
		Scanner sc1 = new Scanner(System.in);
		Integer personsAge = sc1.nextInt();
		
		Person per1 = new Person(personName, personsAge);
		List <Pet> personList = new ArrayList<>();
		map.put(per1, personList);
	}
	public void addPet() {
		System.out.println("Enter the name of owner");
		Scanner sc = new Scanner(System.in);
		String enterName = sc.next();
		Set<Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for(Entry<Person, List<Pet>> entry : entrySet) {
			
			if(entry.getKey().getName().equalsIgnoreCase(enterName)) {				
				
				System.out.println("Enter type of animal");
				Scanner sc1 = new Scanner(System.in);
				String enterPetType = sc1.next();
				
				System.out.println("Enter name of animal");
				Scanner sc2 = new Scanner(System.in);
				String enterPetName = sc2.next();
				
				Pet newPat = new Pet(enterPetType, enterPetName);
				entry.getValue().add(newPat);
			}
		}			
	}
	public void deletePet() {
		System.out.println("Enter the name of owner");
		Scanner sc = new Scanner(System.in);
		String enterOwnerName = sc.next();
		
		Set<Entry<Person, List<Pet>>> setEntry = map.entrySet();
		for(Entry<Person, List<Pet>> entry : setEntry) {
			if(entry.getKey().getName().equalsIgnoreCase(enterOwnerName)) {
				
				System.out.println("Enter the type of owners pet");
				Scanner sc1 = new Scanner(System.in);
				String enterOwnersPetType = sc.next();
				
				System.out.println("Enter the name of owners pet");
				Scanner sc2 = new Scanner(System.in);
				String enterOwnersPetName = sc.next();
				
				
				Iterator<Pet> iterator = entry.getValue().iterator();
				while(iterator.hasNext()) {
					Pet deletedPet = iterator.next();
					if(deletedPet.getPetType().equalsIgnoreCase(enterOwnersPetType)) {						
						if(deletedPet.getPetName().equalsIgnoreCase(enterOwnersPetName)) {
							iterator.remove();
						} 
					} 
				}
			}
		}		
	}
	public void deletePerson() {
		
		System.out.println("Enter the name of person");
		Scanner sc = new Scanner(System.in);
		String enterPersonName = sc.next();
		
		Set <Entry<Person, List<Pet>>> setEntry = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iterator = setEntry.iterator();
		
		while(iterator.hasNext()) {
			Entry<Person, List<Pet>> entry = iterator.next();
			if(entry.getKey().getName().equalsIgnoreCase(enterPersonName)) {
				iterator.remove();
			}
		}				
	}
	
	public void deletePresisePet () {
		
		System.out.println("Enter the type of pet");
		Scanner sc = new Scanner(System.in);
		String enterPetType = sc.next();
		
		Set <Entry<Person, List<Pet>>> entrySet = map.entrySet();
		for(Entry<Person, List<Pet>> entry : entrySet) {
			List<Pet> petList = entry.getValue();
			Iterator<Pet> iterator = petList.iterator();
			while(iterator.hasNext()) {
				Pet myPet = iterator.next();
				if(myPet.getPetType().equalsIgnoreCase(enterPetType)) {
					iterator.remove();
				}
				
			}
		}
	}
	
	
	public Map<Person, List<Pet>> getMap() {
		return map;
	}
	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}
	

}
