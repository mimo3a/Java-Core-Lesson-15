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
		System.out.println("������ 1 ��� ������ �������� �����");
		System.out.println("������ 2 ��� ������ �������� �� �������� �����");
		System.out.println("������ 3 ��� �������� �������� � �������� �����");
		System.out.println("������ 4 ��� �������� �������� � �����");
		System.out.println("������ 5 ��� �������� ��������� �������� � ��� ��������");
		System.out.println("������ 6 ��� ������� �� ����� �������");
		System.out.println("������ 7 ��� ����� � ��������");
	}
}
