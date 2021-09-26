package com.bridgelabz.addressbookprogram;

public class Address {
	private String city,state;
	private long zip;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city= city;
	}
	public String getState() {
		return state;
	}
	public void setSatate(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "City-"+city+" state-"+state+" zip-"+zip;
	}

}
