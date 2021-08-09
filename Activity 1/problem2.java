import java.io.*;
import java.util.*;

public class problem2{
	static int count = 0;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		try{
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = input.nextInt();
			}
			int flag = 0;
			if(n<0){
				System.out.println("Invalid Input");
				flag = 1;
			}

			for(int i=0;i<n;i++){
				if(arr[i]<0){
					System.out.println("Invalid Input");
					flag = 1;
					break;
				}
			}
		
			if(flag==0){
				int count = countRepeaters(arr, n);
				System.out.println(count);
			}
		}
		catch(NegativeArraySizeException e){
			System.out.println("Invalid Input");
		}
	}
	public static int countRepeaters(int[] arr, int n){
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>0){
				break;
			}
		}
		return count+1;
	}
}