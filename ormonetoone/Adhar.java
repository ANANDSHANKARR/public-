package ormonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar 
{
	@Id
	private int adharId;
	private String address;
	private int pincode;
	
	public int getAdharId() {
		return adharId;
	}
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
