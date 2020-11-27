package ua.lviv.lgs;

import java.util.Scanner;

public class ApplicationZoo {
	public static void main(String[] args) {
		ZooClub club = new ZooClub();
		
		
		
		while(true) {
			
			menu();
			
			Scanner sc = new Scanner(System.in);
			String menuNumber = sc.next();
			switch(menuNumber) {
			case "1" : club.addPerson();
			break;
			case "2" :  club.addPet();
			break;
			case "3" :  club.deletePet();
			break;
			case "4" :  club.deletePerson();
			break;
			case "5" :  club.deletePresisePet();
			break;
			case "6" :  club.allClub();
			break;
			case "7" :  System.out.println("Exit from programm");
			System.exit(0);
			break;
			default : System.out.println(" Not found");
			break;
			}
			
		}
		
		
		
	}
	static void menu () {
		System.out.println("Введіть 1 щоб Додати учасника клубу");
		System.out.println("Введіть 2 щоб Додати тваринку до учасника клубу");
		System.out.println("Введіть 3 щоб Видалити тваринку з учасника клубу");
		System.out.println("Введіть 4 щоб Видалити учасника з клубу");
		System.out.println("Введіть 5 щоб Видалити конкретну тваринку зі всіх власників");
		System.out.println("Введіть 6 щоб Вивести на екран зооклуб");
		System.out.println("Введіть 7 щоб Вийти з програми");
	}
}
