import java.io.*;
import java.util.*;

class Employee{
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

class EmployeeMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the name:");
		String name = input.nextLine();
		System.out.println("Enter Address:");
		String address = input.nextLine();
		System.out.println("Enter Mobile:");
		String mobile = input.nextLine();
		emp.setName(name);
		emp.setAddress(address);
		emp.setMobile(mobile);
		System.out.println("Employee Details");
		System.out.println("Name: "+ emp.getName());
		System.out.println("Address: "+ emp.getAddress());
		System.out.println("Mobile: "+ emp.getMobile());
	}
}