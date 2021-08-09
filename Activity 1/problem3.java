import java.io.*;
import java.util.*;

class problem3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int km = input.nextInt();
		int prod=1,n;
		if(km<0 || km>32767){
			System.out.println("Invalid Input");
		}
		else{
			while(km>0){
				n = km%10;
				prod = prod * n;
				km = km/10;
			}
			System.out.println(prod);
		}
	}
}