import java.io.*;
import java.util.*;

class Company{
	private String name;
	private String employees;
	private String teamlead;
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getEmployees(){
		return employees;
	}
	public void setEmployees(String newEmployees){
		this.employees = newEmployees;
	}
	
	public String getTeamlead(){
		return teamlead;
	}
	public void setTeamlead(String newTeamlead){
		this.teamlead = newTeamlead;
	}
}

class CompanyMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the company name:");
		String name = input.nextLine();
		System.out.println("Enter the employees:");
		String employees = input.nextLine();
		System.out.println("Enter TeamLead");
		String teamlead = input.nextLine();
		Company com = new Company();
		com.setName(name);
		com.setEmployees(employees);
		com.setTeamlead(teamlead);
		String[] arrEmployees = employees.split(",");
		int flag=0;
		for(String s:arrEmployees){
			if(s.equals(teamlead)){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Name: "+ com.getName());
			System.out.println("Employees: "+ com.getEmployees());
			System.out.println("Lead: "+ com.getTeamlead());
		}
		else{
			System.out.println("Invalid input");
		}
	}
}