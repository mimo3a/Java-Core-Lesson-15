package ua.lviv.lgs;


import java.util.Scanner;

public class Pet {
	
	private String petType = "Hund";
	private String petName = "Gerda";
	
	
	public Pet(String petType, String petName) {
		super();
		this.petType = petType;
		this.petName = petName;
	}


	@Override
	public String toString() {
		return "Pet [petType=" + petType + ", petName=" + petName + "]";
	}


	public String getPetType() {
		return petType;
	}


	public String getPetName() {
		return petName;
	}


	public void setPetType(String petType) {
		this.petType = petType;
	}


	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	
}
