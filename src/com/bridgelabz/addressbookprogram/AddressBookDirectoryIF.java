package com.bridgelabz.addressbookprogram;

import java.util.ArrayList;
import java.util.HashMap;

public interface AddressBookDirectoryIF {
	public void addAddressBook();
	public void operationDirectory();
	public void displayDirectoryBook();
	public void editAddressBook();
	public void searchByCity();
	public void displayPeopleByRegion(HashMap<String,ArrayList<ContactPerson>>listDisplay);

}
