package mpgcpm;

import java.util.Scanner;

public class Mpgcpm12 {

	public static void main(String[] args)
	{
		
		
		//Declare Variables
		
		int previousMiles = 0, 
		    currentMiles = 0,
		    totalMiles = 0;
		
		final double GALLON = 4.54;
		
		double noOfLitres = 0, totalGallons = 0, mpg = 0.0;
		
		String input = "";
		
		char reply = ' ';
		
		String heading = "MPG Calculator";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Do you know your Miles");
		input = keyboard.next(); 
		reply = input.charAt(0); // n
		
		     // FALSE      OR  false
		if ((reply == 'y') || (reply == 'Y'))
		
		{
			System.out.println("Please enter Miles");
			totalMiles = keyboard.nextInt();
		}
		else 
		{
			System.out.println("Please enter Previous Miles");
			//              Book.chapter1
			previousMiles = keyboard.nextInt();
			
			System.out.println("Please enter Current Miles");
			//              Book.chapter1
			currentMiles = keyboard.nextInt();
			totalMiles = currentMiles - previousMiles;			
		}
				
		System.out.println("Please enter number of litres");
		//              Book.chapter1
		noOfLitres = keyboard.nextDouble();
					
		//Process
				
		totalGallons = noOfLitres / GALLON;
				
		mpg = totalMiles / totalGallons;
			
		System.out.println(heading);
		System.out.println("Miles per gallon is " + mpg);
				
	}

}
