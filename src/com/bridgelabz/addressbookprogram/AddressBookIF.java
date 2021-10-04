package com.bridgelabz.addressbookprogram;

import java.util.List;

public interface AddressBookIF {
	public void displayContents();
	public void addContact();
	public void operation();
	public void deletePerson();
	public void editPerson();
	public void addPersonToCity(ContactPerson contact);
	public void addPersonToState(ContactPerson contact);
	public void printSortedList(List<ContactPerson> sortedContactList);
	public void sortAddressBook(int sortingChoice);
	public void writeToAddressBookFile();
	public List<String> readDataFromFile();
}
