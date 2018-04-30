package mpgcpm;

import java.util.Scanner;

public class Mpgcpm11 {

	public static void main(String[] args)
	{
		
		
		//Declare Variables
		
		int previousMiles = 0, 
		    currentMiles = 0,
		    totalMiles = 0;
		
		final double GALLON = 4.54;
		
		double noOfLitres = 0, totalGallons = 0, mpg = 0.0;
		
		String heading = "MPG Calculator";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter Previous Miles");
		//              Book.chapter1
		previousMiles = keyboard.nextInt();
		
		System.out.println("Please enter Current Miles");
		//              Book.chapter1
		currentMiles = keyboard.nextInt();
		
		System.out.println("Please enter number of litres");
		//              Book.chapter1
		noOfLitres = keyboard.nextDouble();
					
		//Process
		
		totalMiles = currentMiles - previousMiles;
		
				
		totalGallons = noOfLitres / GALLON;
				
		mpg = totalMiles / totalGallons;
			
		System.out.println(heading);
		System.out.println("Miles per gallon is " + mpg);
				
	}

}
