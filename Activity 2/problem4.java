import java.io.*;
import java.util.*;

class Customer{
	private String name;
	private String address;
	private String mobile;
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String newAddress){
		this.address = newAddress;
	}
	
	public String getMobile(){
		return mobile;
	}
	public void setMobile(String newMobile){
		this.mobile = newMobile;
	}
}

class CustomerMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the details:");
		String details = input.nextLine();
		String[] arrDetails = details.split(",", 3);
		Customer cust = new Customer();
		cust.setName(arrDetails[0]);
		cust.setAddress(arrDetails[1]);
		cust.setMobile(arrDetails[2]);
		System.out.println("Name: "+cust.getName());
		System.out.println("Address: "+cust.getAddress());
		System.out.println("Mobile: "+cust.getMobile());
	}
}