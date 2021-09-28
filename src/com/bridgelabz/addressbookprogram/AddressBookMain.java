package com.bridgelabz.addressbookprogram;
import java.util.Scanner;
public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("--------------_Welcome to address Book Programm----------");
		ContactPerson person = new ContactPerson();
		Address address = new Address();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Name:");
		String firstName = scanner.next();

		System.out.println("Enter Last Name:");
		String lastName = scanner.next();

		System.out.println("Enter Email Address:");
		String email = scanner.next();

		System.out.println("Enter Phone Number:");
		long phoneNumber = scanner.nextLong();

		System.out.println("Enter city:");
		String city = scanner.next();

		System.out.println("Enter State");
		String state = scanner.next();

		System.out.println("Enter Zip:");
		long zip =scanner.nextLong();
		 scanner.close();
		 
		 person.setFirstName(firstName);
		 person.setLastName(lastName);
		 person.setPhoneNumber(phoneNumber);
		 person.setEmail(email);
		 address.setCity(city);
		 address.setSatate(state);
		 address.setZip(zip);
		 
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(person);
		addressBook.displayContect();
	}
}
