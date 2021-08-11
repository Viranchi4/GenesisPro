package com.problem1;

import java.util.Scanner;

public class ProblemMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int x = input.nextInt();
		switch(x) {
		case 1:
			System.out.println("Vehicle Make:");
			input.nextLine();
			String make = input.nextLine();
			System.out.println("Vehicle Number:");
			String vehicleNumber = input.nextLine();
			System.out.println("Fuel Type:");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			int y = input.nextInt();
			String fuelType = "";
			if(y==1) {
				fuelType = "Petrol";
			}
			else if(y==2) {
				fuelType = "Diesel";
			}
			System.out.println("Fuel Capacity:");
			input.nextLine();
			int fuelCapacity = input.nextInt();
			System.out.println("Engine CC:");
			int cc = input.nextInt();
			System.out.println("Audio System:");
			input.nextLine();
			String audioSystem = input.nextLine();
			System.out.println("Number of Doors:");
			int numberOfDoors = input.nextInt();
			Vehicle four = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			four.displayBasicInfo();
			four.displayDetailInfo();
			break;
		case 2:
			System.out.println("Vehicle Make:");
			input.nextLine();
			String make1 = input.nextLine();
			System.out.println("Vehicle Number:");
			String vehicleNumber1 = input.nextLine();
			System.out.println("Fuel Type:");
			System.out.println("1. Petrol");
			System.out.println("2. Diesel");
			int y1 = input.nextInt();
			String fuelType1 = "";
			if(y1==1) {
				fuelType1 = "Petrol";
			}
			else if(y1==2) {
				fuelType1 = "Diesel";
			}
			System.out.println("Fuel Capacity:");
			input.nextLine();
			int fuelCapacity1 = input.nextInt();
			System.out.println("Engine CC:");
			int cc1 = input.nextInt();
			System.out.println("Kick Start Available:");
			boolean kickStartAvailable = input.nextBoolean();
			Vehicle two = new TwoWheeler(make1, vehicleNumber1, fuelType1, fuelCapacity1, cc1, kickStartAvailable);
			two.displayBasicInfo();
			two.displayDetailInfo();
		}
	}
}
