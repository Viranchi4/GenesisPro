import java.io.*;
import java.util.*;

class problem1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		String lastName = input.nextLine();
		String firstLetter = firstName.substring(0,1).toUpperCase();
		String rest_firstName = firstName.substring(1, firstName.length()).toLowerCase();
		lastName = lastName.toUpperCase();
		String name = firstLetter + rest_firstName + " " + lastName;
		System.out.println(name);
	}
}