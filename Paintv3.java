package paint;

import java.util.Scanner;

public class Paintv3 {

	public static void main(String[] args) 
	{
			
		//Constants
		final double COVERAGE = 350;
		final double PIE = Math.PI;
		final double GALLON = 4.54;
		final double WASTAGE = 1.10;
		
		
		//Variables
		double surfaceArea = 0.0;
		double radius = 0.0;
		double paintRequired = 0.0;
		double paintRequiredLitres = 0.0;
		
		int index = 0; //index for args array 
		
		//Pass array arguments to calculation
		
		while (index < 4) //T T T T F
		{
			radius = Double.parseDouble(args[index]); //Wrapper Class
				
			//Process
			surfaceArea = (2 * PIE * radius) * WASTAGE;
			
			paintRequired = surfaceArea / COVERAGE;
			
			paintRequiredLitres = paintRequired * GALLON;
			
			//Output
			
			//Paint required in litres is 5.25 for radius 6.0
			
			
			System.out.println("Test Case " + (index+1));
			
			System.out.printf("Paint required in gallons is %.2f for radius %.2f %n%n",
					           paintRequired, radius);
			System.out.printf("Paint required in litres is %.2f for radius %.2f %n%n",
			           paintRequiredLitres, radius);
						
			index = index + 1;
						
		}	
		System.out.print("Out of Loop");
	}

}
