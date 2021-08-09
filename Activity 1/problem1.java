import java.io.*;
import java.util.*;

public class problem1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int salary = input.nextInt();
		int shifts = input.nextInt();
		int saving;
		if(salary>8000){
			System.out.println("Salary too large");
		}
		else if(shifts<0){
			System.out.println("Shifts too small");
		}
		else if(salary<0){
			System.out.println("Salary too small");
		}
		else{
			saving = (int)(salary - ((0.2*salary)+(0.3*salary)) + (0.02*salary*shifts));
			System.out.println(saving);
		}
	}
}