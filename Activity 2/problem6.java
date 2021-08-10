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
		System.out.println("Enter the name:");
		String name = input.nextLine();
		System.out.println("Enter Address:");
		String address = input.nextLine();
		System.out.println("Enter Mobile:");
		String mobile = input.nextLine();
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddress(address);
		emp.setMobile(mobile);
		
		System.out.println("Employee Details");
		System.out.println("Name: "+emp.getName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("Mobile: "+emp.getMobile());
		System.out.println("Verify and update the details:");
		/*System.out.println("Menu");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information are correct/Exit");*/
		int x, flag=0;
		while(flag==0){
			System.out.println("Menu");
			System.out.println("1. Update Employee name");
			System.out.println("2. Update Employee Address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information are correct/Exit");
			x = input.nextInt();
			switch(x){
				case 1:
					System.out.println("Current name is: "+emp.getName());
					System.out.println("Enter the name:");
					input.nextLine(); // since after .nextInt if we user .nextLine the enter after the number input skips the .nextLine
					String name1 = input.nextLine();
					emp.setName(name1);
					break;
				case 2:
					System.out.println("Current address is: "+emp.getAddress());
					System.out.println("Enter the address:");
					input.nextLine();
					String address1 = input.nextLine();
					emp.setAddress(address1);
					break;
				case 3:
					System.out.println("Current mobile is: "+emp.getMobile());
					System.out.println("Enter the mobile:");
					input.nextLine();
					String mobile1 = input.nextLine();
					emp.setMobile(mobile1);
					break;
				case 4:
					System.out.println("The details are:");
					System.out.println("Name: "+emp.getName());
					System.out.println("Address: "+emp.getAddress());
					System.out.println("Mobile: "+emp.getMobile());
					flag=1;
					break;
			}
		}
	}
}