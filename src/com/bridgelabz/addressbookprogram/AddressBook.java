package com.bridgelabz.addressbookprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook implements AddressBookIF{

	private final int NUM_OF_PEOPLE = 5;
	Scanner scanner = new Scanner(System.in);
	ContactPerson[] contactList = new ContactPerson[NUM_OF_PEOPLE];
	public static int numberOfEnteries = 0;

	@Override
	public void operation() {
		boolean moreChange = true;
		do {
			System.out.println("\n Choose the operationn you want to perform:");
			System.out.println("1.Add to address Book\n2.Edit Existing Entry\n3.Display Address Book\n4.Adress Book System");
			switch(scanner.nextInt()) {
			case 1:
				addContact();
				break;
			case 2:
				editPerson();
				break;
			case 3:
				displayContect();
				break;
			case 4:
				deletePerson();
			case 5:
				moreChange = false;
				System.out.println("BYE !");
			}
		}
		while(moreChange);
	}
	@Override
	public void addContact() {
		System.out.println("Enter number of people you want to add to Address Book ");
		int numberOfPeople = scanner.nextInt();
		int endIterator = numberOfPeople+numberOfEnteries;
		if(endIterator>NUM_OF_PEOPLE) {
			System.out.println("Address Book is FULL!");
			System.out.println("You can add:+(NUM_OF_PEOPLE-numberOfEnteries");
			return;
		}
		else {
			for(int index = numberOfEnteries;index<endIterator;index++) {
				ContactPerson person = new ContactPerson();
				Address address = new Address();

				System.out.println("Enter First Name:");
				String firstName = scanner.next();

				System.out.println("Enter Last Name:");
				String lastName= scanner.next();

				System.out.println("Enter Phone Number");
				long phoneNumber = scanner.nextLong();

				System.out.println("Enter Email Address:");
				String email = scanner.next();

				System.out.println("Enter city Name:");
				String city = scanner.next();

				System.out.println("Enter State Name:");
				String state = scanner.next();

				System.out.println("Enter Zip code:");
				long zip = scanner.nextLong();

				person.setFirstName(firstName);
				person.setLastName(lastName);
				person.setEmail(email);
				person.setPhoneNumber(phoneNumber);
				address.setCity(city);
				address.setSatate(state);
				address.setZip(zip);

				person.setAddress(address);
				contactList[index] = person;
				numberOfEnteries++;
			}
		}

	}
	public void editPerson() {
		System.out.println("Enter the first name:");
		String firstName = scanner.next();
		for(int index = 0;index<numberOfEnteries;index++) {
			ContactPerson person =contactList[index];
			if(firstName.contentEquals(person.getFirstName())) {

				Address address = person.getAddress();
				System.out.println("\n Choose the atrributes you want to chnage:");
				System.out.println("1.Last Name\n2.Phone Number\n3.Email\n4.City\5.State\6.ZipCode");
				int choice = scanner.nextInt();

				switch(choice) {
				case 1:
					System.out.println("Enter the correct Last Name:");
					String lastName = scanner.next();
					person.setLastName(lastName);
					break;
				case 2:
					System.out.println("Enter the Correct Phone Number:");
					long phoneNumber = scanner.nextLong();
					person.setPhoneNumber(phoneNumber);
					break;
				case 3:
					System.out.println("Enter the correct Email address:");
					String emaill = scanner.next();
					person.setEmail(emaill);
					break;
				case 4:
					System.out.println("Enter the correct city:");
					String city = scanner.next();
					address.setCity(city);
					break;
				case 5:
					System.out.println("Enter the correct state Name:");
					String state = scanner.next();
					address.setSatate(state);
					break;
				case 6:
					System.out.println("Enter the corect ZipCode:");
					long zip = scanner.nextLong();
					address.setZip(zip);
				}
			}
			else {
				System.err.println("Contact Not Found!");
			}
		}
	}
	@Override
	public void deletePerson() {
		System.out.println("Enter the first name of the person to be deleted");
		String firstName = scanner.next();
		for(int index = 0;index<numberOfEnteries;index++) {
			ContactPerson person = contactList[index];
			if(firstName.equals(person.getFirstName())) {
				for(int nextIndex = index; nextIndex<contactList.length-1; nextIndex++) {
					contactList[nextIndex] = contactList[nextIndex+1];

				}
				numberOfEnteries--;
				return;
			}
		}
	}
	@Override
	public void displayContect() {
		System.out.println("-----------Contact of the Address Book---------");
		for(int index=0;index<numberOfEnteries;index++) {
			System.out.println(contactList[index]);
		}

	}
	@Override
	public void addContact(ContactPerson person) {
		
		
	}
}