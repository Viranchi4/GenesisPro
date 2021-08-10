import java.io.*;
import java.util.*;

class problem4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		try{
			int[] medical = new int[n];
			int[] healthcare = new int[n];
		
			for(int i=0;i<n;i++){
				medical[i] = input.nextInt();
			}
			for(int i=0;i<n;i++){
				healthcare[i] = input.nextInt();
			}
			int flag=0;
			for(int i=0;i<n;i++){
				if(medical[i]<0 || healthcare[i]<0){
					System.out.println("Invalid Input");
					flag=1;
					break;
				}
			}
			if(flag==0){
				int size = n*2;
				int[] result = new int[size];
				highestFeedback(medical, healthcare, result, size);
		
				for(int i=0;i<size;i++){
					if(result[i]==0){
						break;
					}
					System.out.println(result[i]);
				}
			
			}
		}
		catch(NegativeArraySizeException e){
			System.out.println("Invalid Input");
		}
		/*int[] medical = new int[n];
		int[] healthcare = new int[n];
		
		for(int i=0;i<n;i++){
			medical[i] = input.nextInt();
		}
		for(int i=0;i<n;i++){
			healthcare[i] = input.nextInt();
		}
		int flag=0;
		for(int i=0;i<n;i++){
			if(medical[i]<0 || healthcare[i]<0){
				System.out.println("Invalid Input");
				flag=1;
				break;
			}
		}
		if(flag=0){
			int size = n*2;
			int[] result = new int[size];
			highestFeedback(medical, healthcare, result, size);
		
			for(int i=0;i<size;i++){
				System.out.println(result[i]);
			}
			
		}*/
		/*int size = n*2;
		int[] result = new int[size];
		highestFeedback(medical, healthcare, result, size);
		
		for(int i=0;i<size;i++){
			System.out.println(result[i]);
		}*/
	}
	public static void highestFeedback(int[] medical, int[] healthcare, int[] result, int n){
		
		for(int i=0,k=0;i<(n/2) && k<n;i+=2){
			if(medical[i]==healthcare[i]){
				if(medical[i+1]>healthcare[i+1]){
					result[k] = medical[i];
					result[k+1] = medical[i+1];
					k = k+2;
				}
				else{
					result[k] = medical[i];
					result[k+1] = healthcare[i+1];
					k = k+2;
				}
			}
			else{
				result[k] = medical[i];
				result[k+1] = medical[i+1];
				result[k+2] = healthcare[i];
				result[k+3] = healthcare[i+1];
				k = k+4;
			}
		}
	}
}