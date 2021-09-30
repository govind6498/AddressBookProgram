package com.bridgelabz.addressbookprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookDirectory {
	//	private static final int NUM_OF_ADDRESS_BOOKS = 5;
	public AddressBook addressBook;
	Scanner scannerObject = new Scanner(System.in);
	Map<String,AddressBook> addressBookDirectory = new HashMap<String,AddressBook>();


	public void operationDirectory() {
		boolean moreChanges = true;
		do {
			System.out.println("\nChoose the operation on the Directory you want to perform");
			System.out.println("1.Add an Address Book\n2.Edit Existing Address Book\n3.Search Person By City\n4.Search Person By State\n5.Display Address book Directory\n6.Exit Address book System");
			switch (scannerObject.nextInt()) {
			case 1:
				addAddressBook();
				break;
			case 2:
				editAddressBook();
				break;
			case 3:
				displayDirectoryContents();
				searchByCity();
				break;
			case 4:
				searchByState();
				break;
			case 5:
				displayDirectoryContents();
				break;
			case 6:
				moreChanges = false;
				System.out.println("Exiting Address Book Directory !");
			}
		} while (moreChanges);
	}


	public void addAddressBook() {
		System.out.println("Enter the name of the Address Book you want to add");
		String bookNameToAdd = scannerObject.next();
		if(addressBookDirectory.containsKey(bookNameToAdd)) {
			System.out.println("Book Name Already Exists");
			return;
		}
		AddressBook addressBook = new AddressBook();
		addressBook.setAddressBookName(bookNameToAdd);
		addressBookDirectory.put(bookNameToAdd, addressBook);
	}
	public void editAddressBook() {
		System.out.println("Enter the Name of the Address Book which you want to edit:");
		String addressBookToEdit = scannerObject.next();
		if(addressBookDirectory.containsKey(addressBookToEdit)) {
			addressBook = addressBookDirectory.get(addressBookToEdit);
			addressBook.operation();
		}
		else {
			System.out.println("Book Does Not Exist");
		}

	}
	public void searchByCity() {

		System.out.println("Enter the name of the City where the Person resides : ");
		String cityName = scannerObject.next();
		System.out.println("Enter the name of the Person : ");
		String personName = scannerObject.next();

		for(AddressBook addressBook : addressBookDirectory.values()) {
			for(ContactPerson person : addressBook.getContact()) {
				if(person.getFirstName().equals(personName) && person.getAddress().getCity().equals(cityName)) {
					System.out.println(personName+" Found in Address Book : "+addressBook.getAddressBookName()+" !");
					System.out.println(person);
					return;
				}
			}
		}
		System.out.println("Contact Does Not Exist !!");

	}
	public void searchByState() {

		System.out.println("Enter the name of the State where the Person resides : ");
		String StateName = scannerObject.next();
		System.out.println("Enter the name of the Person : ");
		String personName = scannerObject.next();

		for(AddressBook addressBook : addressBookDirectory.values()) {
			for(ContactPerson person : addressBook.getContact()) {
				if(person.getFirstName().equals(personName) && person.getAddress().getState().equals(StateName)) {
					System.out.println(personName+" Found in Book : "+addressBook.getAddressBookName()+" !");
					System.out.println(person);
					return;
				}
			}
		}
		System.out.println("Contact Does Not Exist !!");

	}
	public void displayDirectoryContents() {

		System.out.println("----- Contents of the Address Book Directory-----");
		for (String eachBookName : addressBookDirectory.keySet()) {

			System.out.println(eachBookName);
		}
		System.out.println("-----------------------------------------");
	}
}